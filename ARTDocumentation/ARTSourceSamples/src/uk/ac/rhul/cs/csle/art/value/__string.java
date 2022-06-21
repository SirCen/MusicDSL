package uk.ac.rhul.cs.csle.art.value;

import uk.ac.rhul.cs.csle.art.term.ITerms;
import uk.ac.rhul.cs.csle.art.util.ARTException;

public class __string extends Value {
  private final String value;

  @Override
  public String value() {
    return value;
  }

  public __string(String value, ITerms iTerms) {
    this.iTerms = iTerms;
    this.value = value;
  }

  public __string(ITerms iTerms, int termIndex) {
    this.iTerms = iTerms;
    value = iTerms.getTermSymbolString(iTerms.getTermChildren(termIndex)[0]);
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
    __string other = (__string) obj;
    if (value == null) {
      if (other.value != null) return false;
    } else if (!value.equals(other.value)) return false;
    return true;
  }

  @Override
  public String toString() {
    return "__string(" + value + ")";
  }

  @Override
  public Value __size() {
    return new __int32(value.length(), this.iTerms);
  }

  @Override
  public Value __get(Value r) throws ARTException {
    return new __char(value.charAt(((__int32) r).value()), iTerms);
  }

  @Override
  public Value __append(Value r) {
    return new __string(value + ((__string) r).value, iTerms);
  }

  @Override
  public Value __prepend(Value r) {
    return new __string(((__string) r).value + value, iTerms);
  }

  @Override
  public Value __slice(Value r, Value rr) throws ARTException {
    int lo = ((__int32) r).value();
    int hi = ((__int32) rr).value();

    return new __string(value.substring(lo, hi), iTerms);
  }
}