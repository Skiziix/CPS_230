import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
   Property Tax
*/

public class Garage extends Application
{
    private double total;

   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create the controls for the actual value.
      Label avPrompt = new Label("Actual Value:");
      TextField avTextField = new TextField();
      HBox avHBox = new HBox(10, avPrompt, avTextField);
      avHBox.setAlignment(Pos.CENTER);
      
      // Create the assessment value output labels.
      Label assessmentDescriptor = new Label("Total: " + this.getTotal());
      Label assessmentOutputLabel = new Label();
      HBox assessmentHBox = new HBox(10, assessmentDescriptor, assessmentOutputLabel);
      assessmentHBox.setAlignment(Pos.CENTER_LEFT);
      
      
      // Create the calcButton control.
      Button oilChangeButton = new Button("Oil Change");
      Button lubeChangeButton = new Button("Lube Job");
      Button radiatorFlushButton = new Button("Radiator Flush");
      Button transmissionFlushButton = new Button("Transmission Fluid");
      Button inspectionButton = new Button("Inspection");
      Button mufflerReplacementButton = new Button("Muffler Replacement");
      Button tireRotationButton = new Button("Tire Rotation");
      VBox buttonVBox = new VBox(10, oilChangeButton, lubeChangeButton, radiatorFlushButton,
                                transmissionFlushButton, inspectionButton, mufflerReplacementButton,
                                tireRotationButton);
      buttonVBox.setAlignment(Pos.CENTER_LEFT);
      
      //  Create your button Handlers Here!!
      oilChangeButton.setOnAction(event -> {changeTotal(35); assessmentDescriptor.setText("Total: " + getTotal());});
      lubeChangeButton.setOnAction(event -> {changeTotal(25); assessmentDescriptor.setText("Total: " + getTotal());});
      radiatorFlushButton.setOnAction(event -> {changeTotal(50); assessmentDescriptor.setText("Total: " + getTotal());});
      transmissionFlushButton.setOnAction(event -> {changeTotal(120); assessmentDescriptor.setText("Total: " + getTotal());});
      inspectionButton.setOnAction(event -> {changeTotal(35); assessmentDescriptor.setText("Total: " + getTotal());});
      mufflerReplacementButton.setOnAction(event -> {changeTotal(200); assessmentDescriptor.setText("Total: " + getTotal());});
      tireRotationButton.setOnAction(event -> {changeTotal(20); assessmentDescriptor.setText("Total: " + getTotal());});

           
      // Put everything into a VBox
      VBox mainVBox = new VBox(10, buttonVBox, avHBox, assessmentHBox,
                                   taxHBox);
      mainVBox.setAlignment(Pos.CENTER);
      mainVBox.setPadding(new Insets(10));
      
      // Add the main VBox to a scene.
      Scene scene = new Scene(mainVBox, 250, 500);
      //scene.setResizable(false);
      
      // Set the scene to the stage aand display it.
      primaryStage.setScene(scene);
      primaryStage.setResizable(false);
      primaryStage.show();

      class SetTotal implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            assessmentDescriptor.setText("Total: " + getTotal());
        }
      }
   }

   public void changeTotal(double add) {
        this.total = this.total + add;
   }

   public double getTotal() {
        return this.total;
   }

   class OilChange implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(35);
            System.out.println(total);
        }

   }

   class LubeJob implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(25);
            System.out.println(total);
        }

    }

    class RadiatorFlush implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(50);
            System.out.println(total);
        }

   }

   class TransmissionFlush implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(120);
            System.out.println(total);
        }

    }

    class Inspection implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(35);
            System.out.println(total);
        }

   }

   class MufflerReplacement implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(200);
            System.out.println(total);
        }

    }

    class TireRotation implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(20);
            System.out.println(total);
        }

   }
   
   class LaborTime implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(60 * 2);
            System.out.println(total);
        }

    }
}