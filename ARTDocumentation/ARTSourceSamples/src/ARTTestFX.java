import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.util.text.ARTText;

public class ARTTestFX extends Application {

  public static void main(final String[] arguments) throws FileNotFoundException, ARTException {
    Application.launch(arguments);
  }

  @Override
  public void start(final Stage stage) throws IOException, ARTException {
    try {
      new ARTTestCore().core(getParameters().getRaw().toArray(new String[0]));
    } catch (ARTException e) {
      ARTText.printFatal(e.getMessage());
    }
  }

}
