package uk.ac.rhul.cs.csle.art.value;

import uk.ac.rhul.cs.csle.art.term.ITerms;

public class __char extends Value {
  private final char value;

  @Override
  public
  Character value() {
    return value;
  }

  public __char(Character value, ITerms iTerms) {
    this.iTerms = iTerms;
    this.value = value;
  }

  public __char(ITerms iTerms, int termIndex) {
    this.iTerms = iTerms;
    int[] children = this.iTerms.getTermChildren(termIndex);
    String child = this.iTerms.getTermSymbolString(children[0]);
    value = child.charAt(0);
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
    __char other = (__char) obj;
    if (value != other.value) return false;
    return true;
  }

  @Override
  public String toString() {
    return "__char(" + value + ")";
  }

  @Override
  public Value __gt(Value r) {
    return new __boolean(value > ((__char) r).value, this.iTerms);
  }

  @Override
  public Value __ge(Value r) {
    return new __boolean(value >= ((__char) r).value, this.iTerms);
  }

  @Override
  public Value __lt(Value r) {
    return new __boolean(value < ((__char) r).value, this.iTerms);
  }
}