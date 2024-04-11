import javax.swing.text.Position;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Slider;

/**
 *  Metric Converter application
 */

public class MetricConverter extends Application
{
   // Fields
   private TextField kiloTextField;
   private Label resultLabel;
   private RadioButton milesButton;
   private RadioButton feetButton;
   private RadioButton inchesButton;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create an empty Label to display the result.
      Label resultLabelMile = new Label("Miles: 0.0");
      Label resultLabelFeet = new Label("Feet: 0.0");
      Label resultLabelInch = new Label("Inches: 0.0");
      Label resultLabelKilometer = new Label("Kilometers: 0.0");


      // Create the slider control.
      Slider kiloSlider = new Slider(0.0, 50.0, 0.0);
      kiloSlider.valueProperty().addListener(
        (observable, oldvalue, newvalue) -> {
            double kilometers = kiloSlider.getValue();

            double miles = kilometers * 0.6214;
            double feet = kilometers * 3281.0;
            double inches = kilometers * 39370.0;

            resultLabelMile.setText("Miles: " + String.format("%,.2f", miles));
            resultLabelFeet.setText("Feet: " + String.format("%.2f", feet));
            resultLabelInch.setText("Inches: " + String.format("%.2f", inches));
            resultLabelKilometer.setText("Kilometers: " + String.format("%.2f", kilometers));
        }
      );

    
      VBox results = new VBox(5, resultLabelMile, resultLabelFeet, resultLabelInch, resultLabelKilometer);
      results.setAlignment(Pos.CENTER);

      HBox sliderHBox = new HBox(20, kiloSlider);
      sliderHBox.setAlignment(Pos.CENTER);
      
      // Put everything in a VBox.
      VBox mainVBox = new VBox(10, results, sliderHBox);
      
      // Set the VBox's alignment to center.
      mainVBox.setAlignment(Pos.CENTER);
      
      // Set the VBox's padding to 10 pixels.
      mainVBox.setPadding(new Insets(10));
      
      // Create a Scene.
      Scene scene = new Scene(mainVBox);

      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Metric Converter");
      
      // Show the window.
      primaryStage.show();   
   }
}