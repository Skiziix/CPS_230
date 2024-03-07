import javax.swing.JOptionPane;

public class Driver {

    static Month month;
    static boolean again;
    public static void main(String[] args) {
        
        do {
            String userInput = JOptionPane.showInputDialog("Enter a month name or number: ");

            try {
                int monthNumber = Integer.parseInt(userInput);
                createMonth(monthNumber);
            } catch (NumberFormatException e){
                //do string stuff
                createMonth(userInput);
            }

        } while (again);

    }

    public static void createMonth(String monthName) {

        try {
            month = new Month(monthName);
            showMonth();
                
        } catch (InvalidMonthName e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Invalid Month Name!"
                                          ,JOptionPane.ERROR_MESSAGE);
        }

        askAgain();

    }

    public static void createMonth(int monthNumber) {

        try {
            month = new Month(monthNumber);
            showMonth();;
                
        } catch (MonthOutOfRange e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Invalid Month Number (1-12)!"
                                          ,JOptionPane.ERROR_MESSAGE);
        }

        askAgain();
            
    }

    public static void askAgain() {
        
        Object[] options = {"Yes", "No"};

        int answer = JOptionPane.showOptionDialog(null, "Enter again?: ", "Another Month?: ", JOptionPane.YES_NO_OPTION,
                                                     JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
                                                    
        again = (options[answer].equals("Yes")) ? true : false;

    }

    public static void showMonth() {
        JOptionPane.showMessageDialog(null, month, "Month Info", JOptionPane.INFORMATION_MESSAGE);
    }
}
