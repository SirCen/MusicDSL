package uk.ac.rhul.cs.csle.art.value;

import java.util.LinkedHashMap;

import uk.ac.rhul.cs.csle.art.term.ITerms;

public class __mapChain extends Value {

  private final __mapChain parent = null;
  private final LinkedHashMap<Value, Value> value = new LinkedHashMap<>();

  __mapChain parent() {
    return parent;
  }

  @Override
  public
  LinkedHashMap<Value, Value> value() {
    return value;
  }

  public __mapChain(ITerms iTerms) {
    this.iTerms = iTerms;
  }

  public __mapChain(ITerms iTerms, int parentIndex) {
    this.iTerms = iTerms;
    // TODO: connect to parent
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((parent == null) ? 0 : parent.hashCode());
    result = prime * result + ((value == null) ? 0 : value.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!super.equals(obj)) return false;
    if (getClass() != obj.getClass()) return false;
    __mapChain other = (__mapChain) obj;
    if (parent == null) {
      if (other.parent != null) return false;
    } else if (!parent.equals(other.parent)) return false;
    if (value == null) {
      if (other.value != null) return false;
    } else if (!value.equals(other.value)) return false;
    return true;
  }

  private void toStringRec(StringBuilder sb) {
    boolean notFirst = false;
    sb.append("(");
    if (parent != null) sb.append(parent.toString());
    for (Value v : value.keySet()) {
      if (notFirst)
        sb.append(",");
      else
        notFirst = true;
      sb.append(v);
    }
    sb.append(")");
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("__mapChain(");
    toStringRec(sb);
    sb.append(")");
    return sb.toString();
  }

  @Override
  public Value __size() {
    return new __int32(value.size() + (parent != null ? ((__int32) parent.__size()).value() : 0), this.iTerms);
  }

  @Override
  public Value __put(Value r, Value rr) {
    value.put(r, rr);
    return this;
  }

  @Override
  public Value __get(Value r) {

    if (value.containsKey(r))
      return value.get(r);
    else if (parent != null) return parent.__get(r);

    return iTerms.valueEmpty;
  }

  @Override
  public Value __contains(Value r) {
    if (value.containsKey(r))
      return iTerms.valueBooleanTrue;
    else if (parent != null) return parent.__contains(r);

    return iTerms.valueBooleanFalse;
  }
}