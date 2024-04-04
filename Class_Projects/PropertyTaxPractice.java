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

/**
   Property Tax
*/

public class PropertyTaxPractice extends Application
{
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
      Button calcButton = new Button("Calculate Property Tax");
      HBox buttonHBox = new HBox(calcButton);
      buttonHBox.setAlignment(Pos.CENTER);
      
      //  Create your button Handlers Here!!
      
      
      
      
      
           
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
}