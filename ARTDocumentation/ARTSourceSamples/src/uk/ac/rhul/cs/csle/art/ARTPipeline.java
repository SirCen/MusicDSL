package uk.ac.rhul.cs.csle.art;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import uk.ac.rhul.cs.csle.art.term.ITerms;
import uk.ac.rhul.cs.csle.art.term.ITermsLowLevelAPI;
import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.util.text.ARTText;
import uk.ac.rhul.cs.csle.art.v3.alg.ARTParserBase;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.ARTGLLRDT;
import uk.ac.rhul.cs.csle.art.v3.manager.ARTManager;
import uk.ac.rhul.cs.csle.art.v3.manager.module.ARTV3Module;
import uk.ac.rhul.cs.csle.art.v3.manager.parser.ARTV4Lexer;
import uk.ac.rhul.cs.csle.art.v3.manager.parser.ARTV4Parser;
import uk.ac.rhul.cs.csle.art.value.__int32;

public class ARTPipeline {
  private final int termVariableCount = 10;
  private final int termSequenceVariableCount = 10;
  final ITerms iTerms = new ITermsLowLevelAPI(termVariableCount, termSequenceVariableCount);

  private final int stringRewriteIndex = iTerms.findString("stringRewrite");
  private final int caseSensitiveTerminalSymbolIndex = iTerms.findString("srCaseSensitiveTerminal");
  private final int caseInsensitiveTerminalSymbolIndex = iTerms.findString("srCaseInsensitiveTerminal");
  private final int characterTerminalSymbolIndex = iTerms.findString("srCharacterTerminal");
  private final int characterRangeTerminalSymbolIndex = iTerms.findString("srCharacterRangeTerminal");
  private final int srSlotSymbolIndex = iTerms.findString("srSlot");

  private final int moduleSymbolIndex = iTerms.findString("'module'");
  private final int artSymbolIndex = iTerms.findString("art");

  private final int termRewriteIndex = iTerms.findString("termRewrite");
  private final int trTransitionSymbolIndex = iTerms.findString("trTransition");
  private final int trMatchSymbolIndex = iTerms.findString("trMatch");
  private final int trLabelSymbolIndex = iTerms.findString("trLabel");
  private final int trRELATIONSymbolIndex = iTerms.findString("TRRELATION");

  private final int ragRewriteIndex = iTerms.findString("ragRewrite");

  private final int attributeEquationIndex = iTerms.findString("attributeEquation");

  private final int directiveIndex = iTerms.findString("directive");
  private final int tryElementSymbolIndex = iTerms.findString("tryElement");

  private final int tryVerbositySymbolIndex = iTerms.findString("tryVerbosity");
  private final int tryInputSymbolIndex = iTerms.findString("tryInput");
  private final int tryFileInputSymbolIndex = iTerms.findString("tryFileInput");
  private final int tryTestSymbolIndex = iTerms.findString("tryTest");

  private final Map<Integer, ARTModule> modules = new HashMap<>();
  private ARTModule currentModule = new ARTModule(iTerms, artSymbolIndex); // set up default main module
  private ARTModule resolvedModule = null;
  private final Map<Integer, Integer> constructorDefinitions = new HashMap<>(); // The number of times a constructor appears as the root of a term
  private final Map<Integer, Integer> constructorUsages = new HashMap<>(); // The number of times a constructor appears
  private final Set<Integer> functionsInUse = new HashSet<>(); // The set of functions in use
  private final Map<Integer, Map<Integer, Integer>> variableNamesByRule = new HashMap<>(); // Map from term to the variable aliases used in that term
  private final Map<Integer, Map<Integer, Integer>> reverseVariableNamesByRule = new HashMap<>(); // Map from term to the variable aliases used in that term

  private final Map<String, String> textAliasMap = new HashMap<>();

  private void loadTextAliasMap(String key, String value) {
    textAliasMap.put(key, value);
  }

  private final Map<String, String> latexAliasMap = new HashMap<>();

  private void loadLatexAliasMap(String key, String value) {
    latexAliasMap.put(key, value);
  }

  private final Map<Integer, String> preOrderTextMap = new HashMap<>();
  private final Map<Integer, String> inOrderTextMap = new HashMap<>();
  private final Map<Integer, String> postOrderTextMap = new HashMap<>();

  private void loadTextMap(int symbol, String preOrder, String inOrder, String postOrder) {
    preOrderTextMap.put(symbol, preOrder);
    inOrderTextMap.put(symbol, inOrder);
    postOrderTextMap.put(symbol, postOrder);
  }

  private final Map<Integer, String> preOrderLatexMap = new HashMap<>();
  private final Map<Integer, String> inOrderLatexMap = new HashMap<>();
  private final Map<Integer, String> postOrderLatexMap = new HashMap<>();

  private void loadLatexMap(int symbol, String preOrder, String inOrder, String postOrder) {
    preOrderLatexMap.put(symbol, preOrder);
    inOrderLatexMap.put(symbol, inOrder);
    postOrderLatexMap.put(symbol, postOrder);
  }

  String tTerm(int termIndex) {
    return iTerms.toString(termIndex, preOrderTextMap, inOrderTextMap, postOrderTextMap, textAliasMap, null, false);
  }

  String tTerm(int termIndex, Map<Integer, Integer> variableMap) {
    return iTerms.toString(termIndex, preOrderTextMap, inOrderTextMap, postOrderTextMap, textAliasMap, variableMap, false);
  }

  String tTerm(int termIndex, int depthLimit, Map<Integer, Integer> variableMap) {
    return iTerms.toString(termIndex, depthLimit, false, preOrderTextMap, inOrderTextMap, postOrderTextMap, textAliasMap, variableMap, false);
  }

  String lTerm(int termIndex, Map<Integer, Integer> variableMap) {
    return iTerms.toString(termIndex, preOrderLatexMap, inOrderLatexMap, postOrderLatexMap, latexAliasMap, variableMap, true);
  }

  String lTerm(int termIndex) {
    return iTerms.toString(termIndex, preOrderLatexMap, inOrderLatexMap, postOrderLatexMap, latexAliasMap, null, true);
  }

  public ARTPipeline(String[] args) throws ARTException {
    modules.put(currentModule.nameIndex, currentModule);

    if (args.length == 0)
      throw new ARTException("No arguments supplied\n\nART " + ARTVersion.version() + " usage: java -jar art.jar argument1, argument2, ...\n\n"
          + "An argument is either a filename which does not begin with a ! character, or an ART directive beginning with a ! character.\n"
          + "For details of ART directives, see the documentation at https://art.csle.cs.rhul.ac.uk");

    StringBuilder commandLineSpecification = new StringBuilder();

    for (String arg : args)
      if (arg.charAt(0) == '!')
        commandLineSpecification.append(arg + " ");
      else
        commandLineSpecification.append(ARTText.readFile(arg));

    runPipeline(commandLineSpecification.toString());
  }

  void collectModuleSetsRec(int term) throws ARTException {
    final int termSymbolIndex = iTerms.getTermSymbolIndex(term);
    // System.out.println(symbol);

    if (termSymbolIndex == srSlotSymbolIndex)
      currentModule.slotCount++;
    else if (termSymbolIndex == stringRewriteIndex) {
      currentModule.nonterminals.add(iTerms.getSubterm(term, 0));
      if (currentModule.defaultStartStringRewriteRule == 0) currentModule.defaultStartStringRewriteRule = iTerms.getSubterm(term, 0, 0);
      for (int rhsIndex = 1; rhsIndex < iTerms.getTermArity(term); rhsIndex++)
        extendMap(currentModule.stringRewriteRules, iTerms.getSubterm(term, 0, 0), iTerms.getSubterm(term, rhsIndex));
    } else if (termSymbolIndex == termRewriteIndex) {
      int relation = iTerms.getSubterm(term, 1, 1, 1);
      if (currentModule.termRewriteRules.get(relation) == null) currentModule.termRewriteRules.put(relation, new HashMap<>());
      int conclusionLHS = iTerms.getSubterm(term, 1, 1, 0, 0);
      // System.out.println("Updating rules for relation " + tTerm(relation, null) + " with " + tTerm(conclusionLHS, null) + " in " + tTerm(term, null));
      extendMap(currentModule.termRewriteRules.get(relation), conclusionLHS, term);
    } else if (termSymbolIndex == ragRewriteIndex) {
      int ragSymbolTermIndex = iTerms.getSubterm(term, 0, 0, 0, 0);
      if (currentModule.ragRewriteRules.get(ragSymbolTermIndex) == null)
        currentModule.ragRewriteRules.put(iTerms.getTermSymbolIndex(ragSymbolTermIndex), term);
      else
        throw new ARTException("Doubly defined RAG rules for " + tTerm(term, null));
    } else if (termSymbolIndex == attributeEquationIndex) {
      extendMap(currentModule.attributeEquations, iTerms.getSubterm(term, 0), term);
    } else if (termSymbolIndex == caseSensitiveTerminalSymbolIndex || termSymbolIndex == caseInsensitiveTerminalSymbolIndex
        || termSymbolIndex == characterTerminalSymbolIndex || termSymbolIndex == characterRangeTerminalSymbolIndex) {
      currentModule.terminals.add(term);
    } else if (termSymbolIndex == directiveIndex) {
      if (iTerms.getTermSymbolIndex(iTerms.getSubterm(term, 0)) == moduleSymbolIndex) {
        int newModuleNameIndex = iTerms.getTermSymbolIndex(iTerms.getSubterm(term, 1, 0));
        if ((currentModule = modules.get(newModuleNameIndex)) == null)
          modules.put(newModuleNameIndex, currentModule = new ARTModule(iTerms, newModuleNameIndex));
      } else if (iTerms.getTermSymbolIndex(iTerms.getSubterm(term, 0)) == tryElementSymbolIndex) {
        currentModule.tryList.add(iTerms.getSubterm(term, 0));
      } else
        extendMap(currentModule.directives, iTerms.getSubterm(term, 0), iTerms.getSubterm(term, 1));
    }
    for (int i = 0; i < iTerms.getTermArity(term); i++)
      collectModuleSetsRec(iTerms.getSubterm(term, i));
  }

  private void extendMap(Map<Integer, List<Integer>> map, int keyTerm, int valueTerm) {
    // System.out.println("Extending map with key " + keyTerm + ": " + tTerm(keyTerm));
    int symbolIndex = iTerms.getTermSymbolIndex(keyTerm);
    if (map.get(symbolIndex) == null) map.put(symbolIndex, new LinkedList<Integer>());
    map.get(symbolIndex).add(valueTerm);
  }

  void runPipeline(String initialSpecification) throws ARTException {

    // 1. Set up
    // Default values for directives

    // Pre-load text aliases for transition symbols
    loadTextAliasMap("'->'", " -> ");
    loadTextAliasMap("'->*'", " ->* ");

    loadTextAliasMap("'=>'", " => ");
    loadTextAliasMap("'=>*'", " =>* ");

    loadTextAliasMap("'-|>'", " -|> ");
    loadTextAliasMap("'-|>*'", " -|>* ");

    loadTextAliasMap("'=|>'", " =|> ");
    loadTextAliasMap("'=|>*'", " =|>* ");

    loadTextAliasMap("'~>'", " ~> ");
    loadTextAliasMap("'~>*'", " ~>* ");

    // Pre-load LaTeX aliases for transition symbols
    loadLatexAliasMap("'->'", "\\rightarrow ");
    loadLatexAliasMap("'->*'", "\\rightarrow* ");

    loadLatexAliasMap("'=>'", "\\Rightarrow ");
    loadLatexAliasMap("'=>*'", "\\Rightarrow* ");

    loadLatexAliasMap("'-|>'", "\\downarrow ");
    loadLatexAliasMap("'-|>*'", "\\downarrow* ");

    loadLatexAliasMap("'=|>'", "\\Downarrow ");
    loadLatexAliasMap("'=|>*'", "\\Downarrow* ");

    loadLatexAliasMap("'~>'", "\\leadsto ");
    loadLatexAliasMap("'~>*'", "\\leadsto* ");

    // Pre-load text pretty printer maps

    loadTextMap(iTerms.findString("tryVerbosity"), "", "", " ");
    loadTextMap(iTerms.findString("tryESOSTestTerm"), "", "", "");

    loadTextMap(iTerms.findString("termRewrite"), "", "", "");
    loadTextMap(iTerms.findString("tr"), "", " --- ", "");
    loadTextMap(iTerms.findString("trPremises"), " ", "  ", " ");
    loadTextMap(iTerms.findString("trLabel"), "[", "", "]");
    loadTextMap(iTerms.findString("trMatch"), "", " |> ", "");
    loadTextMap(iTerms.findString("trConfiguration"), "<", ", ", ">");
    loadTextMap(iTerms.findString("trTransition"), "", "", "");
    loadTextMap(iTerms.findString("TRRELATION"), "", "", "");
    loadTextMap(iTerms.findString("tryESOS"), "", "", "");

    loadTextMap(iTerms.findString("__list"), "[", ", ", "]");
    loadTextMap(iTerms.findString("__map"), "{", ", ", "}");
    loadTextMap(iTerms.findString("__binding"), "", "=", "");

    // Pre-load LaTeX pretty printer maps
    loadLatexMap(iTerms.findString("termRewrite"), "\\begin{equation}\n", "", "\n\\end{equation}\n");
    loadLatexMap(iTerms.findString("tr"), "\\frac{", "}{", "}");
    loadLatexMap(iTerms.findString("trPremises"), "", "\\quad ", "");
    loadLatexMap(iTerms.findString("trLabel"), "\\tag*{[", "", "]}");
    loadLatexMap(iTerms.findString("trMatch"), " ", "\\triangleright ", " ");
    loadLatexMap(iTerms.findString("trConfiguration"), "\\langle ", ", ", "\\rangle ");
    loadLatexMap(iTerms.findString("trTransition"), "", "", "");

    loadLatexMap(iTerms.findString("ragTerm"), "", "", "");
    loadLatexMap(iTerms.findString("ragSubterms"), "[", ",", "]");
    loadLatexMap(iTerms.findString("ragLiteral"), "\\mbox{\\tt ", "", "}");
    loadLatexMap(iTerms.findString("ragID"), "\\mbox{\\em ", "", "\\/}");
    loadLatexMap(iTerms.findString("ragConfiguration"), "", "", "");
    loadLatexMap(iTerms.findString("ragCat"), "", "\\cdot ", "");
    loadLatexMap(iTerms.findString("ragRules"), "", "", "");

    loadLatexMap(iTerms.findString("ragRewrite"), "", "", "");
    loadLatexMap(iTerms.findString("ragRewriteSymbol"), "", "", ":\\hfill\n");

    loadLatexMap(iTerms.findString("ragLabeledRule"), "\\begin{multline}\n", "", "\n\\end{multline}\n");
    loadLatexMap(iTerms.findString("ragRule"), "", " \\rightarrow ", "\\hfill");
    loadLatexMap(iTerms.findString("ragRuleLabel"), "\\tag{", "", "}");

    loadLatexMap(iTerms.findString("ragQuery"), "(", "\\mathrel{?} ", ")");
    loadLatexMap(iTerms.findString("ragPair"), " \\langle ", ", ", " \\rangle ");
    loadLatexMap(iTerms.findString("ragInverse"), "\\overline{", " ", "}");

    loadLatexMap(iTerms.findString("ragEmptySet"), "\\emptyset ", "", "");
    loadLatexMap(iTerms.findString("ragEmptyString"), "\\epsilon ", "", "");

    // 2. Parse initial specification to term
    final ARTV4Parser parser = new ARTV4Parser(new ARTV4Lexer());
    parser.artParse(initialSpecification);
    parser.artDisambiguateRightmost();
    if (!parser.artIsInLanguage) throw new ARTException("Syntax error in ART specification");
    // if (parser.artIsAmbiguous()) throw new ARTException("Internal error: specification grammar is ambiguous");
    int root = parser.artDerivationAsTerm(iTerms);
    // System.out.println(tTerm(root)); // Output parsed term to console

    // 3. Traverse term and process !import directives

    // 4. Collect modules and their sets, noting default module and default start symbols as we go
    collectModuleSetsRec(root);

    // for (Integer m : modules.keySet())
    // System.out.println(modules.get(m));

    // 5. Resolve modules - this is degenerate and assumes a single module
    resolvedModule = currentModule;

    eSOSTerminals = new HashMap<>();
    // Interpret directives apart from !module and !try

    // System.out.println("V3 module:\n" + currentModule);

    // 6. Static checks and normalise rules

    Map<Integer, Integer> constructorCount = new HashMap<>(); // The number of defined rules for each constructor Map<Integer, Integer>

    // Stage one - collect information
    constructorDefinitions.put(iTerms.findString("_"), 1);
    constructorDefinitions.put(iTerms.findString("'->'"), 1);
    constructorDefinitions.put(iTerms.findString("'->*'"), 1);
    constructorDefinitions.put(iTerms.findString("'=>'"), 1);
    constructorDefinitions.put(iTerms.findString("'=>*'"), 1);
    constructorDefinitions.put(iTerms.findString("'~>'"), 1);
    constructorDefinitions.put(iTerms.findString("'~>*'"), 1);
    constructorDefinitions.put(iTerms.findString("True"), 1);
    constructorDefinitions.put(iTerms.findString("False"), 1);
    constructorDefinitions.put(iTerms.findString("trLabel"), 1);
    constructorDefinitions.put(iTerms.findString("trTransition"), 1);
    constructorDefinitions.put(iTerms.findString("trMatch"), 1);
    constructorDefinitions.put(iTerms.findString("trPremises"), 1);
    constructorDefinitions.put(iTerms.findString("tr"), 1);
    constructorDefinitions.put(iTerms.findString("trConfiguration"), 1);
    constructorDefinitions.put(iTerms.findString("termRewrite"), 1);

    for (Integer scanRelationIndex : currentModule.termRewriteRules.keySet()) { // Step through the relations
      // System.out.println("Scanning rules for relation " + tTerm(scanRelationIndex, null));
      for (Integer ruleRoot : currentModule.termRewriteRules.get(scanRelationIndex).keySet()) // Collect the map of rules for this relation
        for (Integer ruleIndex : currentModule.termRewriteRules.get(scanRelationIndex).get(ruleRoot)) {// Step through the list of rules
          String tmp = iTerms.getString(ruleRoot);
          // System.out.println("Scanning rule: " + tTerm(ruleIndex, null) + " with rule root " + tmp + " - " + tmp);
          if (constructorDefinitions.get(ruleRoot) == null)
            constructorDefinitions.put(ruleRoot, 1);
          else
            constructorDefinitions.put(ruleRoot, constructorDefinitions.get(ruleRoot) + 1);

          if (tmp.charAt(0) == '_' && tmp.charAt(1) != '_')
            System.out.println("*** Unexpected variable " + tmp + " at root in conclusion LHS of " + tTerm(ruleIndex, null));
          reportInvalidFunctionCallsRec(ruleIndex, iTerms.getSubterm(ruleIndex, 1, 1, 0));

          Map<Integer, Integer> variableNumbers = new HashMap<>();
          Set<Integer> numericVariablesInUse = new HashSet<>(); // The set of functions in use
          nextFreeVariableNumber = 2;
          collectVariablesAndConstructorsRec(ruleIndex, variableNumbers, constructorCount, functionsInUse, numericVariablesInUse, ruleIndex);
          // System.out.println("At rule " + tTerm(ruleIndex, variableNumbers) + ":");
          // System.out.print(" constructor usages:");
          // for (int c : constructorUsages.keySet())
          // System.out.print(" " + iTerms.getString(c) + ":" + constructorUsages.get(c));
          // System.out.print("\n constructor definitions:");
          // for (int c : constructorDefinitions.keySet())
          // System.out.print(" " + iTerms.getString(c) + ":" + constructorDefinitions.get(c));
          //
          // System.out.print("\n functions in use are:");
          // for (int f : functionsInUse)
          // System.out.print(" " + iTerms.getString(f));
          // System.out.print("\n numeric variables in use are:");
          // for (int v : numericVariablesInUse)
          // System.out.print(" " + iTerms.getString(v));
          // System.out.print("\n alphanumeric variables in use are ");
          // for (int v : variableNumbers.keySet())
          // System.out.print(" " + iTerms.getString(v) + "->_" + variableNumbers.get(v));
          // System.out.println();

          if (numericVariablesInUse.size() > 0 && variableNumbers.size() > 0)
            System.out.println("*** Unexpected mix of numeric and alphanumeric variables in " + tTerm(ruleIndex, null));
          for (int v : numericVariablesInUse)
            if (!iTerms.isVariableSymbol(v))
              System.out.println("*** Numeric variable outside available range of _1 to _" + termVariableCount + " in " + tTerm(ruleIndex, null));
          if (variableNumbers.size() > termVariableCount)
            System.out.println("*** More than " + termVariableCount + " variables used in " + tTerm(ruleIndex, null));

          Map<Integer, Integer> reverseVariableNumbers = new HashMap<>();
          for (int v : variableNumbers.keySet())
            reverseVariableNumbers.put(variableNumbers.get(v), v);
          variableNamesByRule.put(ruleIndex, variableNumbers);
          reverseVariableNamesByRule.put(ruleIndex, reverseVariableNumbers);
        }
    }

    for (int c : constructorCount.keySet())
      if (constructorDefinitions.get(c) == null) {
        String label = iTerms.getString(c);

        boolean isNumber = true;
        for (int i = 0; i < label.length(); i++) {
          char ch = label.charAt(i);
          if (!Character.isDigit(ch) && ch != '.') isNumber = false;
        }

        if (!isNumber) System.out.println("*** Constructor " + label + " has no rule definitions");
      }
    // Stage two - rewrite the rules to use only only numeric variables to normalise the configurations
    for (int normaliseRelationIndex : currentModule.termRewriteRules.keySet()) { // Step through the relations
      for (Integer thetaRoot : currentModule.termRewriteRules.get(normaliseRelationIndex).keySet()) { // Collect the map of rules for this relation
        List<Integer> newRuleList = new LinkedList<>();
        for (Integer ruleIndex : currentModule.termRewriteRules.get(normaliseRelationIndex).get(thetaRoot)) {// Step through the list of rules
          // System.out.println("Normalising rule: " + tTerm(ruleIndex, null));
          int rewrittenRule = normaliseRuleRec(ruleIndex, variableNamesByRule.get(ruleIndex));
          // System.out.println("Rewritten to: " + tTerm(rewrittenRule, null));
          newRuleList.add(rewrittenRule);
          // Add in map entries for the rewritten term, which will be the same as for the original rule!
          variableNamesByRule.put(rewrittenRule, variableNamesByRule.get(ruleIndex));
          reverseVariableNamesByRule.put(rewrittenRule, reverseVariableNamesByRule.get(ruleIndex));
        }
        currentModule.termRewriteRules.get(normaliseRelationIndex).put(thetaRoot, newRuleList);
      }
    }

    // 7. Pretty print
    try {
      PrintWriter pw = new PrintWriter(new File("artSpecification.tex"));
      pw.print(
          "\\documentclass[10pt,leqno]{article}\n" + "\\usepackage{amsmath}\n" + "\\usepackage[a4paper, total={18cm, 28cm}]{geometry}\n" + "\\parindent 0pt\n"
              + "\\newcommand{\\artvariable}[1]{\\mbox{\\em #1}}\n" + "\\newcommand{\\artspecial}[1]{\\mbox{\\sf\\em #1}}\n" + "" + "\\begin{document}\n");
      for (Integer r : currentModule.directives.keySet()) {
        for (Integer rr : currentModule.directives.get(r))
          pw.print(lTerm(rr));
      }
      for (Integer r : currentModule.terminals) {
        pw.print(lTerm(r));
      }
      for (Integer r : currentModule.stringRewriteRules.keySet()) {
        for (Integer rr : currentModule.stringRewriteRules.get(r))
          pw.print(lTerm(rr));
      }

      for (Integer r : currentModule.termRewriteRules.keySet()) {
        for (Integer rr : currentModule.termRewriteRules.get(r).keySet())
          for (Integer rrr : currentModule.termRewriteRules.get(r).get(rr))
            pw.println(lTerm(rrr, reverseVariableNamesByRule.get(rrr)));
      }

      for (Integer r : currentModule.attributeEquations.keySet()) {
        for (Integer rr : currentModule.attributeEquations.get(r))
          pw.print(lTerm(rr));
      }

      for (Integer r : currentModule.ragRewriteRules.keySet()) {
        pw.print(lTerm(currentModule.ragRewriteRules.get(r)));
      }

      pw.print("\\end{document}\n");
      pw.close();
    } catch (FileNotFoundException e) {
      throw new ARTException("Unable to write artSpecification.tex");
    }
    // 8. Interpret trys
    for (Integer l : resolvedModule.tryList) {
      // System.out.println(iTerms.toString(l));
      int verbosity = 3;
      int inputIndex = 0;
      int relationIndex = 0;
      int testIndex = 0;

      int[] children = iTerms.getTermChildren(l);
      for (int i : children) {
        // System.out.print(iTerms.getTermSymbolString(i));
        // Note use of dummy value etrick to get the correct constructor
        if (iTerms.getTermSymbolIndex(i) == tryVerbositySymbolIndex && iTerms.getTermArity(i) > 0) // Zero arity means default
          verbosity = new __int32(iTerms, iTerms.getSubterm(i, 0)).value();
        else if (iTerms.getTermSymbolIndex(i) == tryInputSymbolIndex)
          inputIndex = iTerms.getSubterm(i, 0);
        else if (iTerms.getTermSymbolIndex(i) == tryFileInputSymbolIndex) { // Get term from file
          String filename = iTerms.getTermSymbolString(iTerms.getSubterm(i, 0));
          filename = filename.substring(1, filename.length() - 1); // Strip "" characters
          // System.out.println("Loading term from file " + filename);
          String termString = ARTText.readFile(filename);
          inputIndex = iTerms.findTerm(termString);
        } else if (iTerms.getTermSymbolIndex(i) == trRELATIONSymbolIndex)
          relationIndex = iTerms.getSubterm(i, 0);
        else if (iTerms.getTermSymbolIndex(i) == tryTestSymbolIndex) testIndex = iTerms.getSubterm(i, 0);
      }

      System.out.println("** !try " + verbosity + " " + (inputIndex == 0 ? "???" : tTerm(inputIndex)) + (relationIndex != 0 ? tTerm(relationIndex) : "")
          + (testIndex != 0 ? tTerm(testIndex) : ""));

      if (inputIndex == 0) {
        System.out.println("Cannot construct input term - skipping !try");
        continue;
      }

      if (relationIndex != 0) eSOSStepper(verbosity, inputIndex, relationIndex, testIndex);
    }

    // 9. V3 in V4
    ARTManager artManager = new ARTManager();
    ARTV3Module artV3Module = new ARTV3Module(artManager, "ARTV3inV4");

    // Build the enumeration arrays
    int enumerationSize = resolvedModule.terminals.size() + resolvedModule.paraterminals.size() + resolvedModule.nonterminals.size() + 2
        + resolvedModule.slotCount;
    Map<String, Integer> enumerationElements = new HashMap<>();
    String artLabelStrings[] = new String[enumerationSize];
    int[] artKindOfs = new int[enumerationSize];

    int tmpIndex = 0;

    enumerationSet(enumerationElements, artLabelStrings, tmpIndex++, " EOS $", ARTParserBase.ARTK_EOS);

    for (int i : resolvedModule.terminals) {
      String kind = iTerms.getString(iTerms.getTermSymbolIndex(i));
      enumerationSet(enumerationElements, artLabelStrings, tmpIndex++, iTerms.getString(iTerms.getTermSymbolIndex(iTerms.getSubterm(i, 0))),
          kind.equals("srBuiltinTerminal") ? ARTParserBase.ARTK_BUILTIN_TERMINAL
              : kind.equals("srCharacterTerminal") ? ARTParserBase.ARTK_CHARACTER_TERMINAL
                  : kind.equals("srCharacterRangeTerminal") ? ARTParserBase.ARTK_CHARACTER_RANGE_TERMINAL
                      : kind.equals("srCaseSensitiveTerminal") ? ARTParserBase.ARTK_CASE_SENSITIVE_TERMINAL
                          : kind.equals("srCaseInsensitiveTerminal") ? ARTParserBase.ARTK_CASE_INSENSITIVE_TERMINAL : 0);
    }
    Arrays.sort(artLabelStrings, 1, tmpIndex);
    resolvedModule.epsilon = tmpIndex;
    enumerationSet(enumerationElements, artLabelStrings, tmpIndex++, "#", ARTParserBase.ARTK_EPSILON);
    for (int i : resolvedModule.nonterminals)
      enumerationSet(enumerationElements, artLabelStrings, tmpIndex++, iTerms.getString(iTerms.getTermSymbolIndex(iTerms.getSubterm(i, 0))),
          ARTParserBase.ARTK_NONTERMINAL);
    Arrays.sort(artLabelStrings, resolvedModule.epsilon + 1, tmpIndex);

    for (int i = 0; i < tmpIndex; i++)
      artKindOfs[i] = enumerationElements.get(artLabelStrings[i]);

    // !! debug check array
    // for (int i = 0; i < enumerationSize; i++)
    // System.out.println(i + ": " + artKindOfs[i] + " - " + artLabelStrings[i]);

    ARTGLLRDT artRDT = new ARTGLLRDT("RDT", artKindOfs, artLabelStrings, initialSpecification);
    for (Integer lhsTerm : resolvedModule.stringRewriteRules.keySet())
      for (Integer rhsTerm : resolvedModule.stringRewriteRules.get(lhsTerm))
        artV3Module.addProduction(iTerms, lhsTerm, rhsTerm, artRDT);

  }

  private int unlabeledRuleNumber = 1;

  private int normaliseRuleRec(Integer ruleIndex, Map<Integer, Integer> variableNameMap) {
    // System.out.println("normaliseRule at " + iTerms.toString(ruleIndex));
    int arity = iTerms.getTermArity(ruleIndex);
    int ruleSymbolIndex = iTerms.getTermSymbolIndex(ruleIndex);

    // Special case processing for unlabelled rules - generate a label ofthe form Rx
    if (arity == 0 && ruleSymbolIndex == trLabelSymbolIndex) {
      // System.out.println("Generating new label R" + unlabeledRuleNumber);
      int[] newChildren = new int[1];
      newChildren[0] = iTerms.findTerm("R" + unlabeledRuleNumber++);
      return iTerms.findTerm(ruleSymbolIndex, newChildren);
    }

    int[] newChildren = new int[arity];

    if (variableNameMap.get(ruleSymbolIndex) != null) {
      // System.out.println(" rewriting " + iTerms.getString(newSymbolNameStringIndex) + " to " +
      // iTerms.getString(variableNameMap.get(newSymbolNameStringIndex)));
      ruleSymbolIndex = variableNameMap.get(ruleSymbolIndex);
    }

    for (int i = 0; i < arity; i++)
      newChildren[i] = normaliseRuleRec(iTerms.getSubterm(ruleIndex, i), variableNameMap);

    return iTerms.findTerm(ruleSymbolIndex, newChildren);
  }

  private int nextFreeVariableNumber = 1;

  private void collectVariablesAndConstructorsRec(int parentRewriteTermIndex, Map<Integer, Integer> variableNumbers, Map<Integer, Integer> constructorCount,
      Set<Integer> functionsInUse, Set<Integer> numericVariablesInUse, Integer termIndex) {
    // System.out.println("collectVariablesAndConstructorsRec() at " + tTerm(termIndex, null));

    int termSymbolIndex = iTerms.getTermSymbolIndex(termIndex);
    if (termSymbolIndex == trLabelSymbolIndex) return; // Do not go down into labels
    String termSymbolString = iTerms.getTermSymbolString(termIndex);

    if (termSymbolString.length() > 1 && termSymbolString.charAt(0) == '_' && termSymbolString.charAt(1) != '_') { // Variable
      if (iTerms.getTermArity(termIndex) > 0)
        System.out.println("*** Unexpected non-leaf variable " + termSymbolString + " in " + tTerm(parentRewriteTermIndex, null));
      boolean isNumeric = true;
      for (int i = 1; i < termSymbolString.length(); i++)
        if (termSymbolString.charAt(i) < '0' || termSymbolString.charAt(i) > '9') isNumeric = false;
      if (isNumeric)
        numericVariablesInUse.add(termSymbolIndex);
      else if (variableNumbers.get(termSymbolIndex) == null) variableNumbers.put(termSymbolIndex, nextFreeVariableNumber++);
    } else if (termSymbolString.length() > 1 && termSymbolString.charAt(0) == '_' && termSymbolString.charAt(1) == '_') { // Function
      functionsInUse.add(termSymbolIndex);
    } else { // Normal constructor
      if (constructorCount.get(termSymbolIndex) == null) constructorCount.put(termSymbolIndex, 0);
      // System.out.println("Updating constructor counts for " + iTerms.getString(termSymbolIndex));
      constructorCount.put(termSymbolIndex, constructorCount.get(termSymbolIndex) + 1);
    }

    for (int i = 0; i < iTerms.getTermArity(termIndex); i++)
      collectVariablesAndConstructorsRec(parentRewriteTermIndex, variableNumbers, constructorCount, functionsInUse, numericVariablesInUse,
          iTerms.getSubterm(termIndex, i));
  }

  private void reportInvalidFunctionCallsRec(int parentRewriteTermIndex, int termIndex) {
    String termSymbolString = iTerms.getTermSymbolString(termIndex);
    int termSymbolIndex = iTerms.getTermSymbolIndex(termIndex);
    if (termSymbolString.length() > 0 && termSymbolString.charAt(0) != '_') {
      if (constructorUsages.get(termSymbolIndex) == null)
        constructorUsages.put(termSymbolIndex, 1);
      else
        constructorUsages.put(termSymbolIndex, constructorUsages.get(termSymbolIndex) + 1);
    }
    // if (termSymbolString.length() > 1 && termSymbolString.charAt(0) == '_' && termSymbolString.charAt(1) == '_'
    // && !iTerms.typeSymbolNames.contains(termSymbolString))
    // System.out.println("*** Unexpected function call " + termSymbolString + " in conclusion LHS of " + tTerm(parentRewriteTermIndex, null));

    for (int i = 0; i < iTerms.getTermArity(termIndex); i++)
      reportInvalidFunctionCallsRec(parentRewriteTermIndex, iTerms.getSubterm(termIndex, i));

  }

  private void enumerationSet(Map<String, Integer> enumerationElements, String[] artLabelStrings, int tmpIndex, String labelString, int kind) {
    artLabelStrings[tmpIndex] = labelString;
    enumerationElements.put(artLabelStrings[tmpIndex], kind);
  }

  /* eSOS interpretation below this line *****************************************************************************************/
  private Map<Integer, Set<Integer>> eSOSTerminals;
  private int eSOSTraceLevel = 3;
  private int eSOSRewriteCallCounter;

  public void eSOSTrace(int level, int indent, String string) {
    if (eSOSTraceLevel >= level) {
      for (int i = 0; i < indent; i++)
        System.out.print("  ");
      System.out.println(string);
    }
  }

  private String bindingsToString(int[] bindings, Map<Integer, Integer> variableMap) {
    StringBuilder sb = new StringBuilder();
    boolean seen = false;
    sb.append("{ ");
    for (int i = 0; i < bindings.length; i++) {
      if (bindings[i] > 0) {
        if (seen) sb.append(", ");
        sb.append(tTerm(iTerms.findTerm("_" + i), variableMap) + "=" + tTerm(bindings[i], variableMap));
        seen = true;
      }
    }
    sb.append(" }");
    return sb.toString();
  }

  private int eSOSRewrite(int configuration, int relation, int indent, boolean topLevel) throws ARTException { // return rewritten term, or -configuration if no
                                                                                                               // rules apply
    ++eSOSRewriteCallCounter;
    eSOSTrace(3, indent, "Rewrite call " + eSOSRewriteCallCounter + " " + tTerm(configuration, 5, null) + "," + tTerm(relation, null));
    int rewrittenConfiguration = configuration;
    int rootTheta = iTerms.getSubterm(configuration, 0);
    Map<Integer, List<Integer>> ruleMap = resolvedModule.termRewriteRules.get(relation);
    if (ruleMap == null) throw new ARTException("No rules found for relation " + relation);
    List<Integer> ruleList = ruleMap.get(iTerms.getTermSymbolIndex(rootTheta));
    if (ruleList != null) nextRule: for (int ruleIndex : ruleList) {
      Map<Integer, Integer> variableMap = reverseVariableNamesByRule.get(ruleIndex);
      eSOSTrace(3, indent, tTerm(ruleIndex, variableMap)); // Anounce the next rule we are going to try
      int lhs = iTerms.getSubterm(ruleIndex, 1, 1, 0);
      int premises = iTerms.getSubterm(ruleIndex, 1, 0);
      int premiseCount = iTerms.getTermArity(premises);
      int rhs = iTerms.getSubterm(ruleIndex, 1, 1, 2);
      int[] bindings = new int[termVariableCount];
      // System.out.println("Test component lhs: " + tTerm(lhs));
      // System.out.println("Test component rhs: " + tTerm(rhs));
      // System.out.println("Test component premises: " + tTerm(premises) + " with arity " + premiseCount);

      int ruleLabel = iTerms.getSubterm(ruleIndex, 0);

      if (!iTerms.matchZeroSV(configuration, lhs, bindings)) {
        eSOSTrace(3, indent, tTerm(ruleLabel, null) + " Theta match failed: seek another rule");
        continue nextRule;
      }

      eSOSTrace(5, indent, tTerm(ruleLabel, null) + " bindings after Theta match " + bindingsToString(bindings, variableMap));

      // Now work through the premises
      for (int i = 0; i < premiseCount; i++) {
        int premise = iTerms.getSubterm(premises, i);
        int premiseRootSymbolIndex = iTerms.getTermSymbolIndex(premise);
        if (premiseRootSymbolIndex == trMatchSymbolIndex) {
          eSOSTrace(4, indent, tTerm(ruleLabel, null) + ".SC" + (i + 1) + " " + tTerm(premise, variableMap));
          if (!iTerms.matchZeroSV(iTerms.substitute(bindings, iTerms.getSubterm(premise, 0)), iTerms.getSubterm(premise, 1), bindings)) {
            eSOSTrace(4, indent, tTerm(ruleLabel, null) + ".SC" + (i + 1) + " failed: seek another rule");
            continue nextRule;
          }
        } else {
          if (iTerms.getTermSymbolIndex(iTerms.getSubterm(premises, i)) == trTransitionSymbolIndex) {
            int rewriteTerm = iTerms.substitute(bindings, iTerms.getSubterm(premise, 0));
            int rewriteRelation = iTerms.getSubterm(premise, 1);
            eSOSTrace(4, indent, tTerm(ruleLabel, null) + ".C" + (i + 1) + " " + tTerm(premise, variableMap));
            int rewrittenTerm;
            if (isTerminatingConfiguration(rewriteTerm, rewriteRelation)) {
              eSOSTrace(3, indent + 1, "No rewrite required as already terminating state" + tTerm(rewriteTerm, null));
              rewrittenTerm = rewriteTerm;
            } else {
              rewrittenTerm = eSOSRewrite(rewriteTerm, rewriteRelation, indent + 1, false);
              if (rewrittenTerm < 0) {
                eSOSTrace(4, indent, tTerm(ruleLabel, null) + ".C" + (i + 1) + " failed: seek another rule");
                continue nextRule;
              }
            }
            if (!iTerms.matchZeroSV(rewrittenTerm, iTerms.getSubterm(premise, 2), bindings)) continue nextRule;
          } else {
            throw new ARTException("Unknown premise kind " + tTerm(premise, null));
          }
        }
        eSOSTrace(5, indent, tTerm(ruleLabel, null) + " bindings after condition" + bindingsToString(bindings, variableMap));
      }
      eSOSTrace(topLevel ? 2 : 3, indent, tTerm(ruleLabel, null) + " rewrite substitution of " + tTerm(rhs, 10, variableMap));
      int ret = iTerms.substitute(bindings, rhs);
      eSOSTrace(topLevel ? 2 : 3, indent, tTerm(ruleLabel, null) + " rewrites to " + tTerm(ret, 10, variableMap));
      return ret;
    }
    if (isTerminatingConfiguration(rewrittenConfiguration, relation)) {
      return rewrittenConfiguration;
    } else {
      return -rewrittenConfiguration; // No rewrites so return negative configuration term index
    }
  }

  void eSOSStepper(int verbosity, int eSOSConfiguration, int relation, int testConfiguration) throws ARTException {
    eSOSTraceLevel = verbosity;
    eSOSRewriteCallCounter = 0;
    int eSOSStepCounter = 0;
    while (true) {
      eSOSTrace(2, 0, "Step " + ++eSOSStepCounter);
      int rewrittenESOSConfiguration = eSOSRewrite(eSOSConfiguration, relation, 1, true);
      if (rewrittenESOSConfiguration < 0) {
        eSOSConfiguration = -rewrittenESOSConfiguration;
        break;
      } // No rewrite found so finished
      if (rewrittenESOSConfiguration == eSOSConfiguration) break;
      eSOSConfiguration = rewrittenESOSConfiguration;
      if (isTerminatingConfiguration(eSOSConfiguration, relation)) break;
    }

    if (isTerminatingConfiguration(eSOSConfiguration, relation))
      eSOSTrace(1, 0, "Normal termination on " + tTerm(eSOSConfiguration, null) + " after " + eSOSStepCounter + " step" + (eSOSStepCounter == 1 ? "" : "s")
          + " and " + eSOSRewriteCallCounter + " call" + (eSOSRewriteCallCounter == 1 ? "" : "s") + " to rewrite()");
    else
      eSOSTrace(1, 0, "Stuck on " + tTerm(eSOSConfiguration, 5, null) + " after " + eSOSStepCounter + " step" + (eSOSStepCounter == 1 ? "" : "s") + " and "
          + eSOSRewriteCallCounter + " call" + (eSOSRewriteCallCounter == 1 ? "" : "s") + " to rewrite()");

    if (testConfiguration != 0) if (eSOSConfiguration == testConfiguration)
      System.out.println("Good");
    else
      System.out.println("Bad");
  }

  boolean isTerminatingConfiguration(int eSOSConfiguration, int relation) {
    int thetaRoot = iTerms.getSubterm(eSOSConfiguration, 0);
    Set<Integer> terminals = eSOSTerminals.get(relation);
    return iTerms.isSpecialTerm(thetaRoot) || (terminals != null && terminals.contains(thetaRoot));
  }
}
