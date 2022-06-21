package uk.ac.rhul.cs.csle.art;

import java.io.FileNotFoundException;

import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.util.text.ARTText;

public class ART {

  public static void main(final String[] args) throws FileNotFoundException, ARTException {
    try {
      new ARTPipeline(args);
    } catch (ARTException e) {
      ARTText.printFatal(e.getMessage());
    }
  }
}
