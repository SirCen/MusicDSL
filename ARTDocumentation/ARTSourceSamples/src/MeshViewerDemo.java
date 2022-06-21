import javafx.application.Application;
import javafx.stage.Stage;
import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.util.graphics.ARTSTLBinaryParser;

public class MeshViewerDemo extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    String filename = "stl/Royal Mail Coach.stl";
    float offset = -200;
    float scale = (float) 24.400;
    // float scale = 1;
    try {
      new MeshViewer(new ARTSTLBinaryParser(filename), -500, -100, -100, scale);
      // new MeshViewer(new ARTSTLASCIIParser(filename), 0, 0, 0, scale);
    } catch (ARTException e) {
      System.err.println(e.getMessage());
    }
  }
}
