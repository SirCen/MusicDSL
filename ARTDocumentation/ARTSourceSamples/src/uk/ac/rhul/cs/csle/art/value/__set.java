package uk.ac.rhul.cs.csle.art.value;

import java.util.HashSet;

import uk.ac.rhul.cs.csle.art.term.ITerms;
import uk.ac.rhul.cs.csle.art.util.ARTException;

public class __set extends Value {
  private final HashSet<Value> value;

  @Override
  public
  HashSet<Value> value() throws ARTException {
    return value;
  }

  public __set(HashSet<Value> value, ITerms iTerms) {
    this.iTerms = iTerms;
    this.value = value;
  }

  public __set(ITerms iTerms, int termIndex) throws ARTException {
    this.iTerms = iTerms;
    value = new HashSet<>();
    // Now walk the children of termIndex, adding them to the list
    int[] children = iTerms.getTermChildren(termIndex);
    for (int i = 0; i < children.length; i++)
      value.add(iTerms.valueFromTerm(children[i]));
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
    __set other = (__set) obj;
    if (value == null) {
      if (other.value != null) return false;
    } else if (!value.equals(other.value)) return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("__set(");
    boolean notFirst = false;
    for (Value v : value) {
      if (notFirst)
        sb.append(",");
      else
        notFirst = true;
      sb.append(v);
    }
    sb.append(")");
    return sb.toString();
  }

  @Override
  public Value __size() {
    return new __int32(value.size(), this.iTerms);
  }

  @Override
  public Value __put(Value r) {
    value.add(r);
    return this;
  }

  @Override
  public Value __contains(Value r) {
    return new __boolean(value.contains(r), this.iTerms);
  }

  @Override
  public Value __remove(Value r) {
    Value key = value.iterator().next();
    value.remove(key);
    return this;
  }

  @Override
  public Value __extract() {
    Value key = value.iterator().next();
    value.remove(key);
    return key;
  }

  @Override
  public Value __union(Value r) throws ARTException {
    value.addAll(((__set) r).value());
    return this;
  }

  @Override
  public Value __intersection(Value r) throws ARTException {
    value.retainAll(((__set) r).value());
    return this;
  }

  @Override
  public Value __difference(Value r) throws ARTException {
    value.removeAll(((__set) r).value());
    return this;
  }

  @Override
  public Value __cast(Value r) {
    return new __set(new HashSet<Value>(value), iTerms);
  }
}