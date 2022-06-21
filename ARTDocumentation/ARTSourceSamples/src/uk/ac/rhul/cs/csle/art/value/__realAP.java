package uk.ac.rhul.cs.csle.art.value;

import java.math.BigDecimal;

import uk.ac.rhul.cs.csle.art.term.ITerms;

public class __realAP extends Value {
  private final BigDecimal value;

  @Override
  public
  BigDecimal value() {
    return value;
  }

  public __realAP(ITerms iTerms, int termIndex) {
    this.iTerms = iTerms;
    value = null;
  }

  public __realAP(BigDecimal value, ITerms iTerms) {
    this.iTerms = iTerms;
    this.value = value;
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
    __realAP other = (__realAP) obj;
    if (value == null) {
      if (other.value != null) return false;
    } else if (!value.equals(other.value)) return false;
    return true;
  }

  @Override
  public String toString() {
    return "__realAP(" + value + ")";
  }

  @Override
  public Value __gt(Value r) {
    return new __boolean(value.compareTo(((__realAP) r).value()) > 0, this.iTerms);
  }

  @Override
  public Value __ge(Value r) {
    return new __boolean(value.compareTo(((__realAP) r).value()) >= 0, this.iTerms);
  }

  @Override
  public Value __lt(Value r) {
    return new __boolean(value.compareTo(((__realAP) r).value()) < 0, this.iTerms);
  }

  @Override
  public Value __le(Value r) {
    return new __boolean(value.compareTo(((__realAP) r).value()) <= 0, this.iTerms);
  }

  @Override
  public Value __neg() {
    return new __realAP(value.negate(), this.iTerms);
  }

  @Override
  public Value __add(Value r) {
    return new __realAP(value.add(((__realAP) r).value), this.iTerms);
  }

  @Override
  public Value __sub(Value r) {
    return new __realAP(value.subtract(((__realAP) r).value), this.iTerms);
  }

  @Override
  public Value __mul(Value r) {
    return new __realAP(value.multiply(((__realAP) r).value), this.iTerms);
  }

  @Override
  public Value __div(Value r) {
    return new __realAP(value.divide(((__realAP) r).value), this.iTerms);
  }

  @Override
  public Value __mod(Value r) {
    return new __realAP(value.remainder(((__realAP) r).value), this.iTerms);
  }

  @Override
  public Value __exp(Value r) {
    return new __realAP(value.pow(((__int32) r).value()), this.iTerms);
  }
}