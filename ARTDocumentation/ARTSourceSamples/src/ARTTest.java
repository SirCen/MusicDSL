
/******************************************************************************
 * ARTTest.java
 *
 * This is a test harness for ART generated Java parsers
 *
 * (c) Adrian Johnstone 2013-17
 *****************************************************************************/
import java.io.FileNotFoundException;

import uk.ac.rhul.cs.csle.art.util.ARTException;

public class ARTTest {
  public static void main(String[] args) throws ARTException, FileNotFoundException {
    new ARTTestCore().core(args);
  }
}
