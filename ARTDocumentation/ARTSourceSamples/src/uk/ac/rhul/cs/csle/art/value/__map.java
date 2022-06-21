package uk.ac.rhul.cs.csle.art.value;

import java.util.HashMap;

import uk.ac.rhul.cs.csle.art.term.ITerms;
import uk.ac.rhul.cs.csle.art.util.ARTException;

public class __map extends Value {
  private final HashMap<Value, Value> value;

  @Override
  public HashMap<Value, Value> value() {
    return value;
  }

  public __map(HashMap<Value, Value> value, ITerms iTerms) {
    this.iTerms = iTerms;
    this.value = value;
  }

  public __map(ITerms iTerms, int termIndex) throws ARTException {
    this.iTerms = iTerms;
    value = new HashMap<>();
    // Now walk the children of termIndex, adding them to the list
    int[] children = iTerms.getTermChildren(termIndex);
    for (int i = 0; i < children.length; i++) {
      if (!iTerms.getTermSymbolString(children[i]).equals("__binding"))
        throw new ARTException("Argument of __map must be a __binding " + iTerms.toString(termIndex));
      int[] grandChildren = iTerms.getTermChildren(children[i]);
      if (grandChildren.length != 2) throw new ARTException("Type __binding must have arity " + i + ": " + iTerms.toString(termIndex));
      value.put(iTerms.valueFromTerm(grandChildren[0]), iTerms.valueFromTerm(grandChildren[1]));
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((value == null) ? 0 : value.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!super.equals(obj)) return false;
    if (getClass() != obj.getClass()) return false;
    __map other = (__map) obj;
    if (value == null) {
      if (other.value != null) return false;
    } else if (!value.equals(other.value)) return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("__map(");
    boolean notFirst = false;
    for (Value v : value.keySet()) {
      if (notFirst)
        sb.append(",");
      else
        notFirst = true;
      sb.append("__binding(" + v + "," + value.get(v) + ")");
    }
    sb.append(")");
    return sb.toString();
  }

  @Override
  public Value __size() {
    return new __int32(value.size(), this.iTerms);
  }

  @Override
  public Value __put(Value r, Value rr) {
    value.put(r, rr);
    return this;
  }

  @Override
  public Value __get(Value r) {
    if (value.containsKey(r)) return value.get(r);

    return iTerms.valueEmpty;
  }

  @Override
  public Value __contains(Value r) {
    if (value.containsKey(r)) return iTerms.valueBooleanTrue;

    return iTerms.valueBooleanFalse;
  }

  @Override
  public Value __remove(Value r) {
    Value key = value.keySet().iterator().next();
    value.remove(key);
    return this;
  }

  @Override
  public Value __extract() {
    Value key = value.keySet().iterator().next();
    Value keyValue = value.get(key);
    value.remove(key);
    return new __binding(key, keyValue, iTerms);
  }

  @Override
  public Value __cast(Value r) {
    // TODO: develop idioms for castingb
    return new __map(new HashMap<Value, Value>(value), iTerms);
  }
}