import javax.swing.JOptionPane;

public class FleetDriver {
    public static void main(String[] args) {
        int numberOfShips = Integer.parseInt(JOptionPane.showInputDialog("How many ships in your fleet?: "));

        Ship ships[] = new Ship[numberOfShips];

        String options = "Ship - (1)" +
                         "\nCruise Ship - (2)" +
                         "\nCargo Ship - (3)\n\n";

        for (int i = 0; i < numberOfShips; i++) {

            String shipType = JOptionPane.showInputDialog(options + "Choose One: ");
            String name = JOptionPane.showInputDialog("Ship name: ");
            String buildYear = JOptionPane.showInputDialog("Year of Ship Construction: ");

            switch(shipType) {
                case "1":
                    ships[i] = new Ship(name, buildYear);
                    break;

                case "2":
                    int maxPassengers = Integer.parseInt(JOptionPane.showInputDialog("Maximum Passenger Capacity: "));
                    ships[i] = new CruiseShip(name, buildYear, maxPassengers);
                    break;

                case "3":
                    int maxTonnage = Integer.parseInt(JOptionPane.showInputDialog("Maximum Cargo Capacity (In Tons): "));
                    ships[i] = new CargoShip(name, buildYear, maxTonnage);
                    break;
            }

        }

        for (int i = 0; i < numberOfShips; i++) {
            JOptionPane.showMessageDialog(null, ships[i], ships[i].getName(), JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
