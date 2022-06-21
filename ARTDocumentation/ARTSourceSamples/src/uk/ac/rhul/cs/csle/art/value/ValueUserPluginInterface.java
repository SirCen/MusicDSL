package uk.ac.rhul.cs.csle.art.value;

import uk.ac.rhul.cs.csle.art.util.ARTException;

public interface ValueUserPluginInterface {
  String name();

  Value user(Value... args) throws ARTException;
}
