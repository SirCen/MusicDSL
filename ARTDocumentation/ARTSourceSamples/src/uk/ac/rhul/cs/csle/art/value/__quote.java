package uk.ac.rhul.cs.csle.art.value;

import uk.ac.rhul.cs.csle.art.term.ITerms;

public class __quote extends Value {
  private final int value;

  @Override
  public
  Integer value() {
    return value;
  }

  public __quote(ITerms iTerms, int termIndex) {
    this.iTerms = iTerms;
    this.value = termIndex;
  }

  public __quote(Integer termIndex, ITerms iTerms) {
    this.iTerms = iTerms;
    this.value = termIndex;
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
    __quote other = (__quote) obj;
    if (value != other.value) return false;
    return true;
  }

  public String toStringLiteral() {
    return "__quote(" + value + ")";
  }

  @Override
  public String toString() {
    return iTerms.toString(value);
  }

}