import javax.swing.JOptionPane;

public class FleetDriver {
    public static void main(String[] args) {

        /*
         * Section One: Creating array for ships
         */

        // How many ships the user plans to make
        int numberOfShips = Integer.parseInt(JOptionPane.showInputDialog("How many ships in your fleet?: "));

        // Array that will store the ships
        Ship ships[] = new Ship[numberOfShips];

        
        /*
         * Section Two: Creating the different ships
         */

        // Input menu
        String options = "Ship - (1)" +
                         "\nCruise Ship - (2)" +
                         "\nCargo Ship - (3)\n\n";

        // Looping over the ships array and asking for ship info
        for (int i = 0; i < numberOfShips; i++) {

            // The input in response to the Input menu
            String shipType = JOptionPane.showInputDialog(options + "Choose One: ");

            // Name of the ship
            String name = JOptionPane.showInputDialog("Ship name: ");

            // Year the ship is built
            String buildYear = JOptionPane.showInputDialog("Year of Ship Construction: ");

            // Switch statement evaluating the type of ship
            switch(shipType) {

                // Regular ship
                case "1":
                    ships[i] = new Ship(name, buildYear);
                    break;

                // Cruise ship
                case "2":
                    int maxPassengers = Integer.parseInt(JOptionPane.showInputDialog("Maximum Passenger Capacity: "));
                    ships[i] = new CruiseShip(name, buildYear, maxPassengers);
                    break;

                // Cargo ship
                case "3":
                    int maxTonnage = Integer.parseInt(JOptionPane.showInputDialog("Maximum Cargo Capacity (In Tons): "));
                    ships[i] = new CargoShip(name, buildYear, maxTonnage);
                    break;
            }

        }

        /*
         * Section Three: Displaying the ship fleet
         */

        for (int i = 0; i < numberOfShips; i++) {
            JOptionPane.showMessageDialog(null, ships[i], ships[i].getName(), JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
