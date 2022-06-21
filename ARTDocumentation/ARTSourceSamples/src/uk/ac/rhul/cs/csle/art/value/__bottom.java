package uk.ac.rhul.cs.csle.art.value;

import uk.ac.rhul.cs.csle.art.term.ITerms;
import uk.ac.rhul.cs.csle.art.util.ARTException;

public class __bottom extends Value {
  @Override
  public Object value() throws ARTException {
    return this;
  }

  public __bottom(ITerms iTerms) {
    this.iTerms = iTerms;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!super.equals(obj)) return false;
    if (getClass() != obj.getClass()) return false;
    return true;
  }

  @Override
  public String toString() {
    return "__bottom";
  }
}