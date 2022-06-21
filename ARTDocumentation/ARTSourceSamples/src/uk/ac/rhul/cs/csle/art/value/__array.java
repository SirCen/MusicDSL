package uk.ac.rhul.cs.csle.art.value;

import java.util.Arrays;

import uk.ac.rhul.cs.csle.art.term.ITerms;
import uk.ac.rhul.cs.csle.art.util.ARTException;

public class __array extends Value {
  private final Value[] value;

  @Override
  public Value[] value() {
    return value;
  }

  public __array(Value[] value, ITerms iTerms) {
    this.iTerms = iTerms;
    this.value = value;
  }

  public __array(ITerms iTerms, int termIndex) throws ARTException {
    // System.out.println("__array constructor called with termIndex " + termIndex + ": " + iTerms.toString(termIndex));
    this.iTerms = iTerms;
    int[] children = iTerms.getTermChildren(termIndex);
    this.value = new Value[(int) iTerms.valueFromTerm(children[0]).value()];

    // Now walk the children of termIndex, adding them to the array
    for (int i = 1; i < children.length; i++)
      value[i - 1] = iTerms.valueFromTerm(children[i]);

    // Now walk the remaining new children, setting them to __empty
    for (int i = children.length - 1; i < value.length; i++)
      value[i] = iTerms.valueEmpty;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Arrays.hashCode(value);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!super.equals(obj)) return false;
    if (getClass() != obj.getClass()) return false;
    __array other = (__array) obj;
    if (!Arrays.equals(value, other.value)) return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("__array(__int32(" + value.length + ")");
    for (Value v : value)
      sb.append(", " + v);
    sb.append(")");
    return sb.toString();
  }

  @Override
  public Value __size() {
    return new __int32(value.length, this.iTerms);
  }

  @Override
  public Value __put(Value r, Value rr) throws ARTException {
    __int32 ri = (__int32) r;
    if (ri.value() >= value.length) throw new ARTException("__array access out of bounds: __put at index " + ri + " with bounds 0.." + value.length);
    value[((__int32) r).value()] = rr;
    return this;
  }

  @Override
  public Value __get(Value r) throws ARTException {
    return value[((__int32) r).value()];
  }

  @Override
  public Value __slice(Value r, Value rr) throws ARTException {
    int lo = ((__int32) r).value();
    int hi = ((__int32) rr).value();

    Value[] retValue = new Value[hi - lo];

    for (int i = lo; i < hi; i++)
      retValue[i - lo] = value[i];

    return new __array(retValue, iTerms);
  }

  @Override
  public Value __cast(Value r) {
    Value[] retValue = new Value[value.length];

    for (int i = 0; i < retValue.length; i++)
      retValue[i] = value[i];

    return new __array(retValue, iTerms);
  }
}