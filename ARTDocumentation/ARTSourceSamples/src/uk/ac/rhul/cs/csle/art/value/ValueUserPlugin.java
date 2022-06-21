package uk.ac.rhul.cs.csle.art.value;

import uk.ac.rhul.cs.csle.art.util.ARTException;

public class ValueUserPlugin implements ValueUserPluginInterface {

  @Override
  public String name() {
    return "Default ValueUserPlugin";
  }

  @Override
  public Value user(Value... args) throws ARTException {
    System.out.println("Default ValueUserPlugin called with " + args.length + " argument" + (args.length == 1 ? "" : "s"));
    for (Value a : args) {
      if (a.value().getClass().isArray()) {
        Value[] v = (Value[]) a.value();

        System.out.println("__array of length " + v.length + " with contents");
        for (int i = 0; i < v.length; i++)
          System.out.println("  " + i + ":" + v[i] + " which has underlying Java " + v[i].getClass() + " and value " + v[i].value());
      } else
        System.out.println(a + " which has underlying Java " + a.value().getClass() + " and value " + a.value());
    }
    return new __string("Default", args[0].iTerms());
  }
}
