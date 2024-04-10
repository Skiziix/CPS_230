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
      Label assessmentDescriptor = new Label("Assessment value:");
      Label assessmentOutputLabel = new Label();
      HBox assessmentHBox = new HBox(10, assessmentDescriptor, assessmentOutputLabel);
      assessmentHBox.setAlignment(Pos.CENTER_LEFT);
      
      // Create the property tax output labels.
      Label taxDescriptor = new Label("Property tax:");
      Label taxOutputLabel = new Label();
      HBox taxHBox = new HBox(10, taxDescriptor, taxOutputLabel);
      taxHBox.setAlignment(Pos.CENTER_LEFT);
      
      // Create the calcButton control.
      Button oilChangeButton = new Button("Oil Change").setOnAction(new OilChange());
      Button lubeChangeButton = new Button("Lube Job").setOnAction(new lubeChangeButton());
      Button radiatorFlushButton = new Button("Radiator Flush").setOnAction(new TransmissionFlush());
      Button transmissionFlushButton = new Button("Transmission Fluid").setOnAction(new TransmissionFlush());
      Button inspectionButton = new Button("Inspection").setOnAction(new Inspection());
      HBox buttonHBox = new HBox(oilChangeButton);
      buttonHBox.setAlignment(Pos.CENTER);
      
      //  Create your button Handlers Here!!
      calcButton.setOnAction(new OilChange());
      
      
      
      
           
      // Put everything into a VBox
      VBox mainVBox = new VBox(10, avHBox, assessmentHBox,
                                   taxHBox, buttonHBox);
      mainVBox.setAlignment(Pos.CENTER);
      mainVBox.setPadding(new Insets(10));
      
      // Add the main VBox to a scene.
      Scene scene = new Scene(mainVBox);
      
      // Set the scene to the stage aand display it.
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public void changeTotal(double add) {
        this.total = this.total + add;
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
        }

    }

    class RadiatorFlush implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(50);
        }

   }

   class TransmissionFlush implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(120);
        }

    }

    class Inspection implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(35);
        }

   }

   class MufflerReplacement implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(200);
        }

    }

    class TireRotation implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(20);
        }

   }
   
   class LaborTime implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            changeTotal(60 * 2);
        }

    }
}