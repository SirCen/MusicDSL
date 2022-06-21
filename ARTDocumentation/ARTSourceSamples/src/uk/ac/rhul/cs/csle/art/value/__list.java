package uk.ac.rhul.cs.csle.art.value;

import java.util.LinkedList;

import uk.ac.rhul.cs.csle.art.term.ITerms;
import uk.ac.rhul.cs.csle.art.util.ARTException;

public class __list extends Value {
  private final LinkedList<Value> value;

  @Override
  public LinkedList<Value> value() {
    return value;
  }

  public __list(LinkedList<Value> value, ITerms iTerms) {
    this.iTerms = iTerms;
    this.value = value;
  }

  public __list(ITerms iTerms, int termIndex) throws ARTException {
    this.iTerms = iTerms;
    value = new LinkedList<>();
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
    __list other = (__list) obj;
    if (value == null) {
      if (other.value != null) return false;
    } else if (!value.equals(other.value)) return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("__list(");
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
  public Value __append(Value r) {
    value.addLast(r);
    return this;
  }

  @Override
  public Value __prepend(Value r) {
    value.addFirst(r);
    return this;
  }

  @Override
  public Value __get(Value r) throws ARTException {
    return value.get(((__int32) r).value());
  }

  @Override
  public Value __cast(Value r) {
    return new __list(new LinkedList<Value>(value), iTerms);
  }
}