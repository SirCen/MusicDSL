package uk.ac.rhul.cs.csle.art.value;

import java.util.ArrayList;

import uk.ac.rhul.cs.csle.art.term.ITerms;
import uk.ac.rhul.cs.csle.art.util.ARTException;

public class __flexArray extends Value {
  private final ArrayList<Value> value;

  @Override
  public
  ArrayList<Value> value() {
    return value;
  }

  public __flexArray(ArrayList<Value> value, ITerms iTerms) {
    this.iTerms = iTerms;
    this.value = value;
  }

  public __flexArray(ITerms iTerms, int termIndex) throws ARTException {
    this.iTerms = iTerms;
    this.value = new ArrayList<>();
    // Now walk the children of termIndex, adding them to the list
    int[] children = iTerms.getTermChildren(termIndex);
    for (int i = 0; i < children.length; i++)
      value.add(iTerms.valueFromTerm(children[i]));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("__flexArray(");
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
  public Value __put(Value r, Value rr) throws ARTException {
    value.set(((__int32) r).value(), rr);
    return this;
  }

  @Override
  public Value __get(Value r) throws ARTException {
    return value.get(((__int32) r).value());
  }

  @Override
  public Value __append(Value r) {
    value.addAll(((__flexArray) r).value);
    return this;
  }

  @Override
  public Value __prepend(Value r) {
    value.addAll(0, ((__flexArray) r).value);
    return this;
  }

  @Override
  public Value __slice(Value r, Value rr) throws ARTException {
    int lo = ((__int32) r).value();
    int hi = ((__int32) rr).value();

    ArrayList<Value> ret = new ArrayList<>();

    for (int i = lo; i < hi; i++) {
      ret.add(value.get(i));
    }

    return new __flexArray(ret, iTerms);
  }

  @Override
  public Value __cast(Value r) {
    return new __flexArray(new ArrayList<Value>(value), iTerms);
  }
}