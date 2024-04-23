import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Art extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Screen Size
        final double SCENE_WIDTH = 640.00;
        final double SCENE_HEIGHT = 480.00;

        // Box's width and height
        final double WIDTH = SCENE_WIDTH * .8;
        final double HEIGHT = 120;

        // Box's (x,y) coordinates
        final double BOX1_X = SCENE_WIDTH - WIDTH;
        final double BOX2_Y = SCENE_HEIGHT - HEIGHT;

        Rectangle box1 = new Rectangle(BOX1_X, BOX2_Y, WIDTH, HEIGHT);

        Pane pane = new Pane(box1);

        // Create scene and display it.
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
