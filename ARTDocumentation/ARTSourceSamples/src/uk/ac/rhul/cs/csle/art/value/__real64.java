package uk.ac.rhul.cs.csle.art.value;

import uk.ac.rhul.cs.csle.art.term.ITerms;
import uk.ac.rhul.cs.csle.art.util.ARTException;

public class __real64 extends Value {
  private final double value;

  @Override
  public
  Double value() throws ARTException {
    return value;
  }

  public __real64(ITerms iTerms, int termIndex) {
    this.iTerms = iTerms;
    value = Double.parseDouble(this.iTerms.getTermSymbolString(this.iTerms.getTermChildren(termIndex)[0]));
  }

  public __real64(double value, ITerms iTerms) {
    this.iTerms = iTerms;
    this.value = value;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    long temp;
    temp = Double.doubleToLongBits(value);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!super.equals(obj)) return false;
    if (getClass() != obj.getClass()) return false;
    __real64 other = (__real64) obj;
    if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value)) return false;
    return true;
  }

  @Override
  public String toString() {
    return "__real64(" + value + ")";
  }

  @Override
  public Value __gt(Value r) {
    return new __boolean(value > ((__real64) r).value, this.iTerms);
  }

  @Override
  public Value __ge(Value r) {
    return new __boolean(value >= ((__real64) r).value, this.iTerms);
  }

  @Override
  public Value __lt(Value r) {
    return new __boolean(value < ((__real64) r).value, this.iTerms);
  }

  @Override
  public Value __le(Value r) {
    return new __boolean(value <= ((__real64) r).value, this.iTerms);
  }

  @Override
  public Value __neg() {
    return new __real64(-value, this.iTerms);
  }

  @Override
  public Value __add(Value r) {
    return new __real64(value + ((__real64) r).value, iTerms);
  }

  @Override
  public Value __sub(Value r) {
    return new __real64(value - ((__real64) r).value, iTerms);
  }

  @Override
  public Value __mul(Value r) {
    return new __real64(value * ((__real64) r).value, iTerms);
  }

  @Override
  public Value __div(Value r) {
    return new __real64(value / ((__real64) r).value, iTerms);
  }

  @Override
  public Value __mod(Value r) {
    return new __real64(value % ((__real64) r).value, iTerms);
  }

  @Override
  public Value __exp(Value r) {
    return new __real64(Math.pow(value, ((__real64) r).value), iTerms);
  }
}