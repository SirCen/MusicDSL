package uk.ac.rhul.cs.csle.art.value;

import uk.ac.rhul.cs.csle.art.term.ITerms;

public class __int32 extends Value {

  private final int value;

  @Override
  public Integer value() {
    return value;
  }

  public __int32(Integer value, ITerms iTerms) {
    this.iTerms = iTerms;
    this.value = value;
  }

  public __int32(ITerms iTerms, int termIndex) {
    this.iTerms = iTerms;
    value = Integer.parseInt(this.iTerms.getTermSymbolString(this.iTerms.getTermChildren(termIndex)[0]));
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + value;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!super.equals(obj)) return false;
    if (getClass() != obj.getClass()) return false;
    __int32 other = (__int32) obj;
    if (value != other.value) return false;
    return true;
  }

  @Override
  public String toString() {
    return "__int32(" + value + ")";
  }

  @Override
  public Value __gt(Value r) {
    return new __boolean(value > ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __ge(Value r) {
    return new __boolean(value >= ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __lt(Value r) {
    return new __boolean(value < ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __le(Value r) {
    return new __boolean(value <= ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __not() {
    return new __int32(~value, this.iTerms);
  }

  @Override
  public Value __and(Value r) {
    return new __int32(value & ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __or(Value r) {
    return new __int32(value | ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __xor(Value r) {
    return new __int32(value ^ ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __cnd(Value r) {
    return new __int32(~value | ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __lsh(Value r) {
    return new __int32(value << ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __rsh(Value r) {
    return new __int32(value >>> ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __ash(Value r) {
    return new __int32(value >> ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __rol(Value r) {
    int lsb = value < 0 ? 1 : 0;
    return new __int32((value << ((__int32) r).value) | lsb, this.iTerms);
  }

  @Override
  public Value __ror(Value r) {
    int msb = value << 31;
    return new __int32((value >> ((__int32) r).value) | msb, this.iTerms);
  }

  @Override
  public Value __neg() {
    return new __int32(-value, this.iTerms);
  }

  @Override
  public Value __add(Value r) {
    return new __int32(value + ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __sub(Value r) {
    return new __int32(value - ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __mul(Value r) {
    return new __int32(value * ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __div(Value r) {
    return new __int32(value / ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __mod(Value r) {
    return new __int32(value % ((__int32) r).value, this.iTerms);
  }

  @Override
  public Value __exp(Value r) {
    int ret = value, ri = ((__int32) r).value;
    if (ri == 0) return new __int32(1, this.iTerms);
    while (ri > 1)
      ret *= value;
    return new __int32(ret, this.iTerms);
  }
}