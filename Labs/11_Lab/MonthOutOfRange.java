/*
 * Throws an error for the month class when a month isn't between 1-12
 */

public class MonthOutOfRange extends Exception{
    
    // Default message
    public MonthOutOfRange() {
        super("This isn't a valid month number!");
    }

    // User context message
    public MonthOutOfRange(int monthNumber) {
        super(monthNumber + " isn't a valid month number!");
    }

}
