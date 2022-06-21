package uk.ac.rhul.cs.csle.art.value;

import uk.ac.rhul.cs.csle.art.term.ITerms;

public class __binding extends Value {
  private final Value key, value; // term numbers for left and right hand side of binding

  Value key() {
    return key;
  }

  @Override
  public Value value() {
    return value;
  }

  public __binding(ITerms iTerms, int termIndex) {
    this.iTerms = iTerms;
    int[] children = iTerms.getTermChildren(termIndex);
    // TODO: extract binings from term tree
    key = null;
    value = null;
  }

  public __binding(Value key, Value value, ITerms iTerms) {
    this.iTerms = iTerms;
    this.key = key;
    this.value = value;
  }

  @Override
  public String toString() {
    return "__binding(" + key + ", " + value + ")";
  }
}