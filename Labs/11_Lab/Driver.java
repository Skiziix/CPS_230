import javax.swing.JOptionPane;

public class Driver {

    static Month month; // Holds the month
    static boolean again; // Boolean value to see if user would like another month
    public static void main(String[] args) {
        
        // Run while the user wants to create new months
        do {

            // Asking user for input. Either month name or number.
            String userInput = JOptionPane.showInputDialog("Enter a month name or number: ");

            /*
             * Try Catch Block to create month
             * and parse user input.
             */
            try {
                int monthNumber = Integer.parseInt(userInput); // Parsing to an integer
                createMonth(monthNumber); // Creating a month based off of the number
            } catch (NumberFormatException e){
                createMonth(userInput); // Creating a month based off of the name
            }

        } while (again);

    }

    /*****************************
      * Methods to create months *
      *****************************/

    // Overloaded string month  
    public static void createMonth(String monthName) {

        /*
         * Try Catch Block catching
         * an invalid month name
         */
        try {
            month = new Month(monthName); // Try to create month
            showMonth(); // Show the month
        
          // Bad month name
        } catch (InvalidMonthName e) {

            // Lets the user know they entered incorrectly
            JOptionPane.showMessageDialog(null, e.getMessage(), "Invalid Month Name!"
                                          ,JOptionPane.ERROR_MESSAGE);
        }

        // Does user want to ask again?
        askAgain();

    }

    // Overloaded int month
    public static void createMonth(int monthNumber) {

        /*
         * Try Catch Block catching
         * an out of range month number
         */
        try {
            month = new Month(monthNumber); // Try to create month
            showMonth(); // Show the month
          
          // Bad month number
        } catch (MonthOutOfRange e) {

            // Lets the user know they entered incorrectly
            JOptionPane.showMessageDialog(null, e.getMessage(), "Invalid Month Number (1-12)!"
                                          ,JOptionPane.ERROR_MESSAGE);
        }

        // Does user want to ask again?
        askAgain();
            
    }

    /*
     * Asks user to create more months
     */
    public static void askAgain() {
        
        // Options for option dialog
        Object[] options = {"Yes", "No"};

        // Dialog box
        int answer = JOptionPane.showOptionDialog(null, "Enter again?: ", "Another Month?: ", JOptionPane.YES_NO_OPTION,
                                                     JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        
        // One-liner: A yes returns true & no returns false
        again = (options[answer].equals("Yes")) ? true : false;

    }

    /*
     * Shows the month in a dialog box
     */
    public static void showMonth() {
        JOptionPane.showMessageDialog(null, month, "Month Info", JOptionPane.INFORMATION_MESSAGE);
    }
}
