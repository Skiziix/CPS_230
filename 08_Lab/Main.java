import javax.swing.JOptionPane;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        /*
         * Section One: Creating the Officer
         */

        
        String name = JOptionPane.showInputDialog("Enter police Officer Name: "); // Asking for officer's name
        String badgeNumber = JOptionPane.showInputDialog("Enter Police Officer Badge Number: "); // Asking for officer's badge

        PoliceOfficer officer = new PoliceOfficer(name, badgeNumber); // Creating officer

        /*
         * Section Two: Index linked vectors
         */
        Vector<ParkedCar> parkedCars = new Vector<ParkedCar>(); // Vector of the parked cars
        Vector<ParkingMeter> parkingMeters = new Vector<ParkingMeter>(); // Vector of the parking meters


        /*
         * Section Three: Creating Cars and Parking Meters
         */

        boolean moreCars = true; // Flag to control when the user is done creating parked cars and meters


        while (moreCars) {


            String make = JOptionPane.showInputDialog("Car Make: "); // Car's make
            String model = JOptionPane.showInputDialog("Car Model: "); // Car's model
            String color = JOptionPane.showInputDialog("Car Color: "); // Car's Color
            String license = JOptionPane.showInputDialog("Car License Number: "); // Car's license
            int minutes = Integer.parseInt(JOptionPane.showInputDialog("Minutes Parked: ")); // Time parked

            int minutesPurchased = Integer.parseInt(JOptionPane.showInputDialog("Meter Minutes Purchased: ")); // Purchased time at meter

            parkedCars.add(new ParkedCar(make, model, color, license, minutes)); // Appending car to parkedCars
            parkingMeters.add(new ParkingMeter(minutesPurchased)); // Appending meter to parkingMeters

            String addCar; // Stores user input on creating more cars
            do {
                addCar = JOptionPane.showInputDialog("Add Another Car? (y) or (n): "); // Yes or no input for creating cars and meters
            } while (!(addCar.equals("y") || addCar.equals("n"))); // If invalid input, then ask again

            // When the user is done creating cars and meters set moreCars flag to false
            if (addCar.equals("n")) {
                moreCars = false;
            }


        }

        /*
         * Section Four: Issuing Tickets
         */

        // Loops over every object in the vectors
        for (int i = 0; i < parkedCars.size(); i++) {

            ParkedCar currentCar = parkedCars.get(i); // Current parked car
            ParkingMeter currenMeter = parkingMeters.get(i); // Current parking meter

            // Only issue ticket if car has been parked longer than time purchased
            if (currentCar.getMinutesParked() > currenMeter.getMinutesPurchased()) {


                ParkingTicket issuedTicket = officer.patrol(currentCar, currenMeter); // The issued ticket


                JOptionPane.showMessageDialog(null, issuedTicket, "Ticket", JOptionPane.INFORMATION_MESSAGE); // Displaying ticket information
            }

        }

    }
    
}
