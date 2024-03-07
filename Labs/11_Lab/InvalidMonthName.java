/*
 * Exceptions for the Month class in the event of an invalid month name
 */

public class InvalidMonthName extends Exception{
    
    // Default message
    public InvalidMonthName() {
        super("Please retype the month. That was invalid!");
    }

    // User context message
    public InvalidMonthName(String monthName) {
        super(monthName + " is an invalid month. Please retype!");
    }
}
