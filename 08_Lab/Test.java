import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test {

    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        System.out.println("Test input: ");

        String test = myObject.nextLine();
        boolean moreCars = true;
        
        while (moreCars) {
        

            while (!(test == "y" || test == "n")) {
                    test = JOptionPane.showInputDialog("Add Another Car? (y) or (n): ");
                    System.out.println(test);
                }

                if (test == "n") {
                    moreCars = false;
                }
            }

        myObject.close();
    }
    
}
