package uk.ac.rhul.cs.csle.art.util.graphics;

import uk.ac.rhul.cs.csle.art.util.ARTException;

public abstract class ARTSTLParser {
  public abstract void readFacet(ARTCoord normal, ARTCoord vertex1, ARTCoord vertex2, ARTCoord vertex3) throws ARTException;

  public abstract int getFacetCount();
}
