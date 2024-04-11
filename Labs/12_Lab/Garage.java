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
      
      
      // Create the assessment value output labels.
      Label totalDisplay = new Label("Total: " + this.getTotal());
      HBox assessmentHBox = new HBox(10, totalDisplay);
      assessmentHBox.setAlignment(Pos.CENTER_LEFT);
      
      
      // Create the inputs //

      // These are all buttons
      Button oilChangeButton = new Button("Oil Change");
      Button lubeChangeButton = new Button("Lube Job");
      Button radiatorFlushButton = new Button("Radiator Flush");
      Button transmissionFlushButton = new Button("Transmission Fluid");
      Button inspectionButton = new Button("Inspection");
      Button mufflerReplacementButton = new Button("Muffler Replacement");
      Button tireRotationButton = new Button("Tire Rotation");

      // These are button and text field pair
      Button avPrompt = new Button("Submit Misc. Time");
      TextField avTextField = new TextField();
      HBox avHBox = new HBox(10, avPrompt, avTextField);
      avHBox.setAlignment(Pos.CENTER_LEFT);


      VBox buttonVBox = new VBox(10, oilChangeButton, lubeChangeButton, radiatorFlushButton,
                                transmissionFlushButton, inspectionButton, mufflerReplacementButton,
                                tireRotationButton, avHBox);
      buttonVBox.setAlignment(Pos.CENTER_LEFT);

      // Change total function for easily readable lambdas.
      ChangeTotalLabel setText = new ChangeTotalLabel(totalDisplay);
      
      // Button handlers, implemented as lambda functions.
      oilChangeButton.setOnAction(event -> {changeTotal(35); setText.changeText();});
      lubeChangeButton.setOnAction(event -> {changeTotal(25); setText.changeText();});
      radiatorFlushButton.setOnAction(event -> {changeTotal(50); setText.changeText();});
      transmissionFlushButton.setOnAction(event -> {changeTotal(120); setText.changeText();});
      inspectionButton.setOnAction(event -> {changeTotal(35); setText.changeText();});
      mufflerReplacementButton.setOnAction(event -> {changeTotal(200); setText.changeText();});
      tireRotationButton.setOnAction(event -> {changeTotal(20); setText.changeText();});
      avPrompt.setOnAction(event -> {miscTime(avTextField); setText.changeText();});

           
      // Put everything into a VBox
      VBox mainVBox = new VBox(10, buttonVBox, avHBox, assessmentHBox);
      mainVBox.setAlignment(Pos.CENTER);
      mainVBox.setPadding(new Insets(10));
      
      // Add the main VBox to a scene.
      Scene scene = new Scene(mainVBox, 350, 500);
      //scene.setResizable(false);
      
      // Set the scene to the stage aand display it.
      primaryStage.setScene(scene);
      primaryStage.setResizable(false);
      primaryStage.show();



   }

   // To change the total
   public void changeTotal(double add) {
        this.total = this.total + add;
   }

   // To get the total
   public double getTotal() {
        return this.total;
   }

   // To submit miscelaneous time
   public void miscTime(TextField input) {
        try {
            this.changeTotal(Double.parseDouble(input.getText()) * 60);
        } 
        
        catch (NumberFormatException e) {
            input.setText("Enter a number!");
        }
   }

   // Changes total display
   public class ChangeTotalLabel {
        private Label totalLabel;

        ChangeTotalLabel(Label totalLabel) {
            this.totalLabel = totalLabel;
        }

        public void changeText() {
            this.totalLabel.setText("Total: " + getTotal());
        }
   }

}