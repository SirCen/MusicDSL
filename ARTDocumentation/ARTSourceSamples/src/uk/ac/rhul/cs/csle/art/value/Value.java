package uk.ac.rhul.cs.csle.art.value;

import uk.ac.rhul.cs.csle.art.term.ITerms;
import uk.ac.rhul.cs.csle.art.util.ARTException;

public abstract class Value {
  protected ITerms iTerms;

  public ITerms iTerms() {
    return iTerms;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((iTerms == null) ? 0 : iTerms.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Value other = (Value) obj;
    if (iTerms == null) {
      if (other.iTerms != null) return false;
    } else if (!iTerms.equals(other.iTerms)) return false;
    return true;
  }

  private void operationNotImplemented(String operation) throws ARTException {
    throw new ARTException("Type " + this.getClass().getSimpleName() + " does not allow operation " + operation);
  }

  public abstract Object value() throws ARTException;

  public Value __eq(Value r) {
    if (equals(r))
      return iTerms.valueBooleanTrue;
    else
      return iTerms.valueBooleanFalse;
  }

  public Value __ne(Value r) {
    if (!equals(r))
      return iTerms.valueBooleanTrue;
    else
      return iTerms.valueBooleanFalse;
  }

  public Value __gt(Value r) throws ARTException {
    operationNotImplemented("__gt(_,_)");
    return null;
  }

  public Value __lt(Value r) throws ARTException {
    operationNotImplemented("__lt(_,_)");
    return null;
  }

  public Value __ge(Value r) throws ARTException {
    operationNotImplemented("__ge(_,_)");
    return null;
  }

  public Value __le(Value r) throws ARTException {
    operationNotImplemented("__le(_,_)");
    return null;
  }

  public Value __not() throws ARTException {
    operationNotImplemented("__not(_)");
    return null;
  }

  public Value __and(Value r) throws ARTException {
    operationNotImplemented("__and(_,_)");
    return null;
  }

  public Value __or(Value r) throws ARTException {
    operationNotImplemented("__or(_,_)");
    return null;
  }

  public Value __xor(Value r) throws ARTException {
    operationNotImplemented("__xor(_,_)");
    return null;
  }

  public Value __cnd(Value r) throws ARTException {
    operationNotImplemented("__cnd(_,_)");
    return null;
  }

  public Value __lsh(Value r) throws ARTException {
    operationNotImplemented("__lsh(_,_)");
    return null;
  }

  public Value __rsh(Value r) throws ARTException {
    operationNotImplemented("__rsh(_,_)");
    return null;
  }

  public Value __ash(Value r) throws ARTException {
    operationNotImplemented("__ash(_,_)");
    return null;
  }

  public Value __rol(Value r) throws ARTException {
    operationNotImplemented("__rol(_,_)");
    return null;
  }

  public Value __rolc(Value r) throws ARTException {
    operationNotImplemented("__rolc(_,_)");
    return null;
  }

  public Value __ror(Value r) throws ARTException {
    operationNotImplemented("__ror(_,_)");
    return null;
  }

  public Value __rorc(Value r) throws ARTException {
    operationNotImplemented("__rorc(_,_)");
    return null;
  }

  public Value __neg() throws ARTException {
    operationNotImplemented("__neg(_)");
    return null;
  }

  public Value __add(Value r) throws ARTException {
    operationNotImplemented("__add(_,_)");
    return null;
  }

  public Value __sub(Value r) throws ARTException {
    operationNotImplemented("__sub(_,_)");
    return null;
  }

  public Value __mul(Value r) throws ARTException {
    operationNotImplemented("__mul(_,_)");
    return null;
  }

  public Value __div(Value r) throws ARTException {
    operationNotImplemented("__div(_,_)");
    return null;
  }

  public Value __mod(Value r) throws ARTException {
    operationNotImplemented("__mod(_,_)");
    return null;
  }

  public Value __exp(Value r) throws ARTException {
    operationNotImplemented("__exp(_,_)");
    return null;
  }

  public Value __size() throws ARTException {
    operationNotImplemented("__size(_)");
    return null;
  }

  public Value __prepend(Value r) throws ARTException {
    operationNotImplemented("__prepend(_,_)");
    return null;
  }

  public Value __append(Value r) throws ARTException {
    operationNotImplemented("__append(_,_)");
    return null;
  }

  public Value __insert(Value r) throws ARTException {
    operationNotImplemented("__insert(_,_)");
    return null;
  }

  public Value __delete(Value r) throws ARTException {
    operationNotImplemented("__delete(_,_)");
    return null;
  }

  public Value __put(Value r) throws ARTException {
    operationNotImplemented("__put(_,_)");
    return null;
  }

  public Value __put(Value r, Value rr) throws ARTException {
    operationNotImplemented("__put(_,_,_)");
    return null;
  }

  public Value __get(Value r) throws ARTException {
    operationNotImplemented("__get(_,_)");
    return null;
  }

  public Value __slice(Value r, Value rr) throws ARTException {
    operationNotImplemented("__slice(_,_,_)");
    return null;
  }

  public Value __contains(Value r) throws ARTException {
    operationNotImplemented("__contains(_,_)");
    return null;
  }

  public Value __remove(Value r) throws ARTException {
    operationNotImplemented("__remove()");
    return null;
  }

  public Value __extract() throws ARTException {
    operationNotImplemented("__extract()");
    return null;
  }

  public Value __union(Value r) throws ARTException {
    operationNotImplemented("__union(_,_)");
    return null;
  }

  public Value __intersection(Value r) throws ARTException {
    operationNotImplemented("__intersection(_,_)");
    return null;
  }

  public Value __difference(Value r) throws ARTException {
    operationNotImplemented("__difference(_,_)");
    return null;
  }

  public Value __cast(Value r) throws ARTException {
    operationNotImplemented("__cast(_,_)");
    return null;
  }

  public final Value __user(Value... args) throws ARTException {
    return iTerms.valueUserPlugin.user(args);
  }
}