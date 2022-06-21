package uk.ac.rhul.cs.csle.art.term;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.Value;
import uk.ac.rhul.cs.csle.art.value.ValueSymbols;
import uk.ac.rhul.cs.csle.art.value.ValueUserPlugin;
import uk.ac.rhul.cs.csle.art.value.ValueUserPluginInterface;
import uk.ac.rhul.cs.csle.art.value.__array;
import uk.ac.rhul.cs.csle.art.value.__binding;
import uk.ac.rhul.cs.csle.art.value.__boolean;
import uk.ac.rhul.cs.csle.art.value.__bottom;
import uk.ac.rhul.cs.csle.art.value.__char;
import uk.ac.rhul.cs.csle.art.value.__done;
import uk.ac.rhul.cs.csle.art.value.__empty;
import uk.ac.rhul.cs.csle.art.value.__flexArray;
import uk.ac.rhul.cs.csle.art.value.__int32;
import uk.ac.rhul.cs.csle.art.value.__intAP;
import uk.ac.rhul.cs.csle.art.value.__list;
import uk.ac.rhul.cs.csle.art.value.__map;
import uk.ac.rhul.cs.csle.art.value.__mapChain;
import uk.ac.rhul.cs.csle.art.value.__quote;
import uk.ac.rhul.cs.csle.art.value.__real64;
import uk.ac.rhul.cs.csle.art.value.__realAP;
import uk.ac.rhul.cs.csle.art.value.__set;
import uk.ac.rhul.cs.csle.art.value.__string;

public abstract class ITerms {
  int dummy = 1;
  int bottomTermIndex;
  public ValueUserPluginInterface valueUserPlugin = new ValueUserPlugin();
  public __boolean valueBooleanTrue = new __boolean(true, this);
  public __boolean valueBooleanFalse = new __boolean(false, this);
  public __int32 valueInt32Zero = new __int32(0, this);
  public __int32 valueInt32One = new __int32(1, this);
  public __int32 valueInt32MinusOne = new __int32(-1, this);
  public __bottom valueBottom = new __bottom(this);
  public __done valueDone = new __done(this);
  public __empty valueEmpty = new __empty(this);

  ITerms() {
    // Try and find a plugin for __user() calls
    Class<?> pluginClass;
    try {
      pluginClass = getClass().getClassLoader().loadClass("ValueUserPlugin");
      valueUserPlugin = (ValueUserPluginInterface) pluginClass.getDeclaredConstructor().newInstance();
    } catch (Exception e) {
      // Silently ignore failure to locate any plugin
    }
    if (valueUserPlugin.name() != null) System.out.println("Attached to ValueUserPlugin : " + valueUserPlugin.name());
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + dummy;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    ITerms other = (ITerms) obj;
    if (dummy != other.dummy) return false;
    return true;
  }

  protected int firstVariableIndex;
  protected int firstSequenceVariableIndex;
  protected int firstSpecialSymbolIndex;
  protected int firstNormalSymbolIndex;

  abstract public int findString(String string);

  abstract public int findTerm(int symbolNameStringIndex, int[] children);

  abstract public int findTerm(String symbolString, int[] childrenArray);

  abstract public int getTermSymbolIndex(int termIndex);

  abstract public String getTermSymbolString(int termIndex);

  abstract public int[] getTermChildren(int termIndex);

  abstract public int getTermArity(int termIndex);

  abstract public int getTermVariableNumber(int termIndex);

  abstract public boolean isSequenceVariableSymbol(int symbolIndex);

  public abstract boolean isSequenceVariableTerm(int termIndex);

  abstract public boolean isVariableSymbol(int symbolIndex);

  public abstract boolean isVariableTerm(int termIndex);

  abstract public boolean isSpecialSymbol(int symbolIndex);

  abstract public boolean isSpecialTerm(int termIndex);

  public abstract int termCardinality();

  public abstract int stringCardinality();

  public abstract String getString(int stringIndex);

  abstract protected int getStringMapNextFreeIndex();

  abstract protected int getStringTotalBytes();

  abstract protected int termBytes();

  public int getSubterm(int term, int... path) {
    int ret = term;
    for (int i = 0; i < path.length; i++)
      ret = getTermChildren(ret)[path[i]];
    return ret;
  }

  /*
   *
   * High level finder: parse a term written in a human-comfortable string form
   *
   * Expression grammar
   *
   * term ::= name ( `( WS subterms `) WS )?
   *
   * subterms ::= term ( `, WS term )*
   *
   * The lexical structure is a litle unusual in that a name can be any string of characters that does not cause an LL(1) nondeterminism, and escape characters
   * are allowed in names. Escape sequences (backslash-X) where X is n, t, r or u are special and have their Java meanings. All other escape sequences yield c.
   * Hence a name can have an embedded * in it, for instance, written \*
   *
   * name ::= nondigit char* WS
   *
   * ----
   *
   * The grammar is arranged so that each method has a single integer synthesized attribute, hence we can use a return type of int
   *
   * For character sequences, the returned value is the key into the string pool.
   *
   * For terms, the returned value is the key into the term pool
   *
   */
  public int findTerm(String term) {
    int ret = 0;
    try {
      ret = findTermThrow(term);
    } catch (ARTException e) {
      syntaxError(e);
    }
    return ret;
  }

  public int findTermThrow(String term) throws ARTException {
    parserSetup(term);
    int ret = term();
    if (cp != input.length())
      throw new ARTException("Unexpected characters after term");
    else
      return ret;
  }

  /*
   * String to term parser
   */
  void parserSetup(String term) {
    input = (term + "\0");
    cp = 0;
    getc();
  }

  String input;
  int cp;
  char cc;

  void getc() {
    cc = input.charAt(cp++);
  }

  void syntaxError(Exception e) {
    System.out.println("** " + e.getMessage());
    System.out.println(input);
    for (int i = 0; i < cp - 1; i++)
      System.out.print("-");
    System.out.println("^");
  }

  int term() throws ARTException {
    int symbolNameStringIndex = symbolName();
    // Semantic checks on symbol name
    String symbolNameString = getString(symbolNameStringIndex);
    if (symbolNameString.charAt(0) == '_') {
      if (symbolNameString.length() > 1 && symbolNameString.charAt(1) == '_') {// two underscores so must be intrinsic function or type
        if (!isSpecialSymbol(symbolNameStringIndex)) throw new ARTException("unknown evaluatable function: " + symbolNameString);
      } else {
        if (!isVariableSymbol(symbolNameStringIndex) && !isSequenceVariableSymbol(symbolNameStringIndex)) throw new ARTException("unknown variable");
      }
    }

    List<Integer> subterms;
    if (cc == '(') {
      getc();
      ws();
      subterms = subterms();
      if (cc != ')') throw new ARTException("Expected ')' or ','");
      getc();
      ws();
    } else
      subterms = new LinkedList<>();

    int[] children = new int[subterms.size()];
    for (int i = 0; i < subterms.size(); i++)
      children[i] = subterms.get(i);

    return findTerm(symbolNameStringIndex, children); // Variable has string = 0
  }

  private List<Integer> subterms() throws ARTException {
    List<Integer> ret = new LinkedList<>();
    ret.add(term());
    while (cc == ',') {
      getc();
      ws();
      ret.add(term());
    }
    return ret;
  }

  private int symbolName() throws ARTException {
    String name = new String();
    if (Character.isWhitespace(cc) || cc == '(' || cc == ')' || cc == ',' || cc == ':' || cc == (char) 0) throw new ARTException("Empty name");
    while (!Character.isWhitespace(cc) && cc != '(' && cc != ')' && cc != ',' && cc != ':' && cc != (char) 0) {
      if (cc == '\\') {
        getc();
        if (cc == 'n')
          cc = '\n';
        else if (cc == 't')
          cc = '\t';
        else if (cc == 'r') cc = '\r';
      }
      name += cc;
      getc();
    }
    ws();
    return findString(name);
  }

  void ws() {
    while (Character.isWhitespace(cc) && cc != (char) 0)
      getc();
  }

  /*
   * String rendering - unparsing
   */
  public String toString(int termIndex) {
    return toString(termIndex, -1); // negative depthLimit means no limit so show full tree
  }

  public String toString(int termIndex, int depthLimit) {
    return toString(termIndex, depthLimit, false);
  }

  public String toString(int termIndex, boolean indent) {
    return toString(termIndex, -1, indent);
  }

  public String toString(int termIndex, int depthLimit, boolean indent) {
    return toString(termIndex, depthLimit, indent, null, null, null, null, null, false);
  }

  public String toString(int termIndex, Map<Integer, String> preOrderMap, Map<Integer, String> inOrderMap, Map<Integer, String> postOrderMap,
      Map<String, String> aliases, Map<Integer, Integer> variableMap, boolean isLatex) {
    return toString(termIndex, -1, false, preOrderMap, inOrderMap, postOrderMap, aliases, variableMap, isLatex);
  }

  /* "Full fat" toString below this line */
  public String toString(int termIndex, int depthLimit, boolean indent, Map<Integer, String> preOrderMap, Map<Integer, String> inOrderMap,
      Map<Integer, String> postOrderMap, Map<String, String> aliases, Map<Integer, Integer> variableMap, boolean isLatex) {
    StringBuilder sb = new StringBuilder();
    indentLevel = 0;
    toStringRec(termIndex, sb, depthLimit, indent, preOrderMap, inOrderMap, postOrderMap, aliases, variableMap, isLatex);
    return sb.toString();
  }

  private int indentLevel;

  private void indent(StringBuilder sb) {
    sb.append("\n");
    for (int i = 0; i < indentLevel; i++)
      sb.append("  ");
  }

  private void toStringRec(int termIndex, StringBuilder sb, int depthLimit, boolean indent, Map<Integer, String> preOrderMap, Map<Integer, String> inOrderMap,
      Map<Integer, String> postOrderMap, Map<String, String> aliases, Map<Integer, Integer> variableMap, boolean isLatex) {
    if (depthLimit == 0) {
      sb.append("..");
      return;
    }

    int symbolIndex = getTermSymbolIndex(termIndex);
    if (variableMap != null && variableMap.get(symbolIndex) != null) symbolIndex = variableMap.get(symbolIndex);
    String preOrderString = preOrderMap == null ? null : preOrderMap.get(symbolIndex);
    if (preOrderString == null) {
      preOrderString = getString(symbolIndex);
      if (aliases != null && aliases.get(preOrderString) != null)
        preOrderString = aliases.get(preOrderString); // Check aliases
      else {
        if (variableMap != null && variableMap.get(symbolIndex) != null) preOrderString = getString(variableMap.get(symbolIndex));
        if (isLatex) preOrderString = toLatexString(preOrderString);
      }
      if (getTermArity(termIndex) > 0) preOrderString += "(";
    }
    String inOrderString = inOrderMap == null ? null : inOrderMap.get(symbolIndex);
    if (inOrderString == null) inOrderString = ", ";

    String postOrderString = postOrderMap == null ? null : postOrderMap.get(symbolIndex);
    if (postOrderString == null) {
      if (getTermArity(termIndex) > 0)
        postOrderString = ")";
      else
        postOrderString = "";
    }

    sb.append(preOrderString);

    if (getTermArity(termIndex) > 0 && indent) {
      indentLevel++;
      indent(sb);
    }
    for (int i = 0; i < getTermArity(termIndex); i++) {
      toStringRec(getTermChildren(termIndex)[i], sb, depthLimit > 0 ? depthLimit - 1 : depthLimit, indent, preOrderMap, inOrderMap, postOrderMap, aliases,
          variableMap, isLatex);
      if (i < getTermArity(termIndex) - 1) {
        sb.append(inOrderString);
        if (indent) indent(sb);
      }
    }
    sb.append(postOrderString);
    if (indent && getTermArity(termIndex) > 0) indentLevel--;
  }

  private String toLatexString(String string) {
    // If the string has any alphanumeric content then
    // 1 Two leading underscores means special symbol \artspecial{}
    // 2 One leading underscore means variable \artvariable{}
    // 3 No leading underscores means normal \mbox{}

    // a trailing P means add a prime, and one trailing digit means a subscript
    boolean hasAlpha = false;
    String opening = "", closing = "";
    boolean hasPrime = false;
    boolean hasSubscript = false;
    char subscript = '?';

    for (int i = 0; i < string.length(); i++)
      if (Character.isAlphabetic(string.charAt(i))) {
        hasAlpha = true;
        break;
      }

    int start = 0, end = string.length();

    if (hasAlpha) {
      closing = "}";

      if (string.charAt(0) == '_') {
        if (string.charAt(1) == '_') {
          opening = "\\artspecial{";
          start = 0;
        } else {
          opening = "\\artvariable{";
          start = 1;

          if (string.charAt(end - 1) == 'P') {
            hasPrime = true;
            end--;
          }

          if (Character.isDigit(subscript = string.charAt(end - 1))) {
            hasSubscript = true;
            end--;
          }

        }
      } else
        opening = "\\mbox{\\sf ";
    }

    string = string.substring(start, end);
    String ret = "";
    for (int i = 0; i < string.length(); i++)
      switch (string.charAt(i)) {
      case '%':
        ret += "\\%";
        break;
      case '&':
        ret += "\\&";
        break;
      case '#':
        ret += "\\#";
        break;
      case '\\':
        ret += "\\\\";
        break;
      case '_':
        ret += "\\_";
        break;
      case '^':
        ret += "\\^";
        break;
      case '$':
        ret += "\\$";
        break;
      default:
        ret += string.charAt(i);
      }

    if (ret.equals("sig"))
      ret = "$\\sigma$";
    else if (ret.equals("rho"))
      ret = "$\\rho$";
    else if (ret.equals("phi"))
      ret = "$\\phi$";
    else if (ret.equals("delta"))
      ret = "$\\delta$";
    else if (ret.equals("nu")) ret = "$\\nu$";

    ret = opening + ret;
    if (hasSubscript) ret += ("$_" + subscript + "$");
    if (hasPrime) ret += ("\\/$^\\prime$");
    ret += closing;

    return ret;
  }

  /*
   * Persistence
   */
  public void dump(PrintStream out) {
    // out.println(stringCardinality() + " " + termCardinality() + " " + firstVariableIndex + " " + firstSequenceVariableIndex + " " + firstSpecialSymbolIndex
    // + " " + firstNormalSymbolIndex);

    for (int stringIndex = 1; stringIndex <= stringCardinality(); stringIndex++) {
      out.print(out == System.out ? (stringIndex + " ") : "");
      out.println(getString(stringIndex));
    }

    for (int termIndex = 1; termIndex <= termCardinality(); termIndex++) {
      out.print(termIndex + " ");
      out.print(getTermSymbolIndex(termIndex));
      if (getTermSymbolIndex(termIndex) != 0) // variables have stringIndex = 0, in which case arity is highjacked as a variable number
        for (int j = 0; j < getTermChildren(termIndex).length; j++)
        out.print(" " + getTermChildren(termIndex)[j]);
      out.println(out == System.out ? (" " + toString(termIndex, 3)) : "");
    }
  }

  protected void undump(BufferedReader input) {// Protected since only accessed from constructor
    System.out.println("readAll() text not yet implemented");
  }

  /*
   * Pattern matching and substitution
   */
  public boolean matchOneSV(int closedTermIndex, int openTermIndex, int[] bindings) throws ARTException { // This matcher allows one sequence variable per
                                                                                                          // sequence of siblings
    return false;
  }

  public boolean matchZeroSV(int closedTermIndex, int openTermIndex, int[] bindings) throws ARTException { // This matcher does not allow sequence variables
    // System.out.println("matchZeroSV() " + toString(closedTermIndex) + " against open term " + toString(openTermIndex));

    if (isSequenceVariableTerm(openTermIndex)) throw new ARTException("in matchZeroSV() right hand side must not contain sequence variables");

    if (isVariableTerm(openTermIndex)) {
      int variableNumber = getTermVariableNumber(openTermIndex);
      if (variableNumber != 0) bindings[variableNumber] = closedTermIndex; // Variable zero means match anything but don't bind
      return true;
    }

    if (!(getTermSymbolIndex(closedTermIndex) == getTermSymbolIndex(openTermIndex) && getTermArity(closedTermIndex) == getTermArity(openTermIndex)))
      return false;
    for (int i = 0; i < getTermArity(openTermIndex); i++)
      if (!matchZeroSV(getTermChildren(closedTermIndex)[i], getTermChildren(openTermIndex)[i], bindings)) return false;
    return true;
  }

  public int substitute(int[] bindings, int openTermIndex) throws ARTException {
    int ret;

    // System.out.println(" Substitute " + toString(openTermIndex) + " with bindings {" + toStringBindings(bindings) + "}");
    // System.out.println(" Open term is " + toString(openTermIndex));
    // Postorder substitution so substitute children first
    int arity = getTermArity(openTermIndex);
    // System.out.println(" Arity is " + arity);

    int[] children = new int[arity];
    int newArity = 0;
    for (int i = 0; i < arity; i++) {
      children[i] = substitute(bindings, getTermChildren(openTermIndex)[i]);
      if (isSequenceVariableTerm(children[i]))
        newArity += getTermArity(children[i]);
      else
        newArity++;
    }

    // if (newArity != arity) {// There were sequence variable bindings, so we must promote the children of the sequences
    // int[] newChildren = new int[newArity];
    // int nextNewChild = 0;
    //
    // for (int i = 0; i < arity; i++) { // If not a sequence child, copy else copy children
    // if (getTermSymbolIndex(children[i]) == 0) // Are we substituting a sequence variable?
    // for (int j = 0; j < getTermArity(children[i]); j++)
    // newChildren[nextNewChild++] = getTermChildren(children[i])[j];
    // else
    // newChildren[nextNewChild++] = children[i];
    // }
    // children = newChildren;
    // }
    //
    if (isVariableTerm(openTermIndex) || isSequenceVariableTerm(openTermIndex)) {
      int termVariableNumber = getTermVariableNumber(openTermIndex);
      int boundValue = bindings[termVariableNumber];
      if (boundValue == 0) throw new ARTException("attempt to substitute unbound variable " + toString(openTermIndex));
      ret = boundValue;
    } else if (isSpecialTerm(openTermIndex))
      ret = evaluateTerm(this, openTermIndex, children);
    else
      ret = findTerm(getTermSymbolIndex(openTermIndex), children);

    // System.out.println("Substitute " + toString(openTermIndex) + " with bindings " + toStringBindings(bindings) + " returns " + toString(ret));
    return ret;
  }

  public String toStringBindings(int[] bindings) {
    String ret = "";
    for (int i = 0; i < bindings.length; i++) {
      if (bindings[i] != 0) ret += " _" + i + "=" + toString(bindings[i]);
    }
    return ret;
  }

  protected int arityCheck(int termIndex, int i) throws ARTException {
    if (getTermArity(termIndex) == i) return termIndex;
    throw new ARTException("Type must have arity " + i + ": " + ITerms.this.toString(termIndex));
  }

  /*** Value system below this line ******************************************************************************************************/

  boolean mixCheck(Value l, Value r, int term) throws ARTException {
    if (l.getClass() != r.getClass()) {
      System.out.println("!! Function error: " + getTermSymbolString(term) + "(" + l.getClass().getSimpleName() + "," + r.getClass().getSimpleName()
          + ") - operands must be of same type; returning __bottom");
      return true;
    } else
      return false;
  }

  public int evaluateTerm(ITerms iTerms, int term, int[] children) throws ARTException {
    String rootSymbolString = iTerms.getTermSymbolString(term);
    if (rootSymbolString.charAt(0) != '_' || rootSymbolString.charAt(1) != '_') return term; // Not a special symbol so nothing to evaluate
    ValueSymbols rootSpecialSymbol = ValueSymbols.valueOf(rootSymbolString);

    switch (rootSpecialSymbol) {
    case __bottom:
    case __done:
    case __empty:
    case __quote:
    case __binding:
    case __boolean:
    case __char:
    case __intAP:
    case __int32:
    case __realAP:
    case __real64:
    case __array:
    case __list:
    case __flexArray:
    case __string:
    case __set:
    case __map:
    case __mapChain:
      return findTerm(getTermSymbolIndex(term), children);
    default:
      break;
    }

    // Now do multiArity __user
    if (rootSpecialSymbol == ValueSymbols.__user) {
      Value[] values = new Value[children.length];
      for (int i = 0; i < children.length; i++)
        values[i] = valueFromTerm(children[i]);
      return iTerms.findTerm(values[0].__user(values).toString());
    }

    int arity = children.length;
    Value rr = null, r = null, l = null;
    if (arity > 0) l = valueFromTerm(children[0]);
    if (arity > 1) r = valueFromTerm(children[1]);
    if (arity > 2) rr = valueFromTerm(children[2]);

    // System.out.println("Evaluating term " + toString(term) + " with l = " + l + " and r = " + r + " and rr = " + rr);
    if (arity == 0)
      throw new ARTException("Unknown arity-zero function " + rootSymbolString);
    else if (arity == 1)

      switch (rootSpecialSymbol) {
      case __not:
        return iTerms.findTerm(l.__not().toString());
      case __neg:
        return iTerms.findTerm(l.__neg().toString());
      case __size:
        return iTerms.findTerm(l.__size().toString());
      case __extract:
        return iTerms.findTerm(l.__extract().toString());
      default:
        throw new ARTException("Unknown monadic function " + rootSymbolString);
      }
    else if (arity == 2)
      switch (rootSpecialSymbol) {
      case __eq:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__eq(r).toString());
      case __ne:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__ne(r).toString());
      case __gt:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__gt(r).toString());
      case __lt:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__lt(r).toString());
      case __ge:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__ge(r).toString());
      case __le:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__le(r).toString());
      case __and:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__and(r).toString());
      case __or:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__or(r).toString());
      case __xor:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__xor(r).toString());
      case __cnd:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__cnd(r).toString());
      case __lsh:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__lsh(r).toString());
      case __rsh:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__rsh(r).toString());
      case __ash:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__ash(r).toString());
      case __rol:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__rol(r).toString());
      case __ror:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__ror(r).toString());
      case __add:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__add(r).toString());
      case __sub:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__sub(r).toString());
      case __mul:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__mul(r).toString());
      case __div:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__div(r).toString());
      case __mod:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__mod(r).toString());
      case __exp:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__exp(r).toString());
      case __prepend:
        return iTerms.findTerm(l.__prepend(r).toString());
      case __append:
        return iTerms.findTerm(l.__append(r).toString());
      case __put:
        return iTerms.findTerm(l.__put(r).toString());
      case __get:
        return iTerms.findTerm(l.__get(r).toString());
      case __contains:
        return iTerms.findTerm(l.__contains(r).toString());
      case __remove:
        return iTerms.findTerm(l.__remove(r).toString());
      case __union:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__union(r).toString());
      case __intersection:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__intersection(r).toString());
      case __difference:
        if (mixCheck(l, r, term)) return bottomTermIndex;
        return iTerms.findTerm(l.__difference(r).toString());
      case __cast:
        return iTerms.findTerm(l.__cast(r).toString());
      default:
        throw new ARTException("Unknown arity-2 function " + rootSymbolString);
      }
    else if (arity == 3) switch (rootSpecialSymbol) {
    case __put:
      return iTerms.findTerm(l.__put(r, rr).toString());
    case __slice:
      return iTerms.findTerm(l.__slice(r, rr).toString());
    default:
      throw new ARTException("Unknown arity-3 function " + rootSymbolString);
    }
    return 0; // Actually this should never be executed as exceptions will cut in first
  }

  public Value valueFromTerm(int term) throws ARTException {
    String rootSymbolString = getTermSymbolString(term);
    // System.out.println("valueFromTerm " + toString(term));
    if (rootSymbolString.charAt(0) != '_' || rootSymbolString.charAt(1) != '_') return new __quote(this, term); // Not a special symbol so nothing to evaluate
    ValueSymbols rootSpecialSymbol = ValueSymbols.valueOf(rootSymbolString);

    switch (rootSpecialSymbol) {
    case __bottom:
      arityCheck(term, 0);
      return valueBottom;
    case __done:
      arityCheck(term, 0);
      return valueDone;
    case __empty:
      arityCheck(term, 0);
      return valueEmpty;
    case __quote:
      arityCheck(term, 1);
      return new __quote(this, term);
    case __binding:
      arityCheck(term, 2);
      return new __binding(this, term);
    case __boolean:
      arityCheck(term, 1);
      // TODO: convert to using constants
      return new __boolean(this, term);
    case __char:
      arityCheck(term, 1);
      return new __char(this, term);
    case __intAP:
      arityCheck(term, 1);
      return new __intAP(this, term);
    case __int32:
      arityCheck(term, 1);
      return new __int32(this, term);
    case __realAP:
      arityCheck(term, 1);
      return new __realAP(this, term);
    case __real64:
      arityCheck(term, 1);
      return new __real64(this, term);
    case __array:
      return new __array(this, term);
    case __list:
      return new __list(this, term);
    case __flexArray:
      return new __flexArray(this, term);
    case __string:
      arityCheck(term, 1);
      return new __string(this, term);
    case __set:
      return new __set(this, term);
    case __map:
      return new __map(this, term);
    case __mapChain:
      return new __mapChain(this, term);

    default:
      return new __quote(this, term);
    }
  }
}
