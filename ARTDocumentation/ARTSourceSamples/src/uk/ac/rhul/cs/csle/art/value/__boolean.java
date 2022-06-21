package uk.ac.rhul.cs.csle.art.value;

import uk.ac.rhul.cs.csle.art.term.ITerms;

public class __boolean extends Value {
  private final boolean value;

  @Override
  public
  Boolean value() {
    return value;
  }

  public __boolean(Boolean b, ITerms iTerms) {
    this.iTerms = iTerms;
    value = b;
  }

  public __boolean(ITerms iTerms, int termIndex) {
    this.iTerms = iTerms;
    int[] children = this.iTerms.getTermChildren(termIndex);
    String child = this.iTerms.getTermSymbolString(children[0]);
    if (child.equals("True"))
      value = true;
    else
      value = false;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + (value ? 1231 : 1237);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!super.equals(obj)) return false;
    if (getClass() != obj.getClass()) return false;
    __boolean other = (__boolean) obj;
    if (value != other.value) return false;
    return true;
  }

  @Override
  public String toString() {
    return value ? "__boolean(True)" : "__boolean(False)";
  }

  @Override
  public Value __not() {
    return new __boolean(!value, this.iTerms);
  }

  @Override
  public Value __or(Value r) {
    return new __boolean(value | ((__boolean) r).value, this.iTerms);
  }

  @Override
  public Value __and(Value r) {
    return new __boolean(value & ((__boolean) r).value, this.iTerms);
  }

  @Override
  public Value __xor(Value r) {
    return new __boolean(value ^ ((__boolean) r).value, this.iTerms);
  }

  @Override
  public Value __cnd(Value r) {
    return new __boolean(!value | ((__boolean) r).value, this.iTerms);
  }
}