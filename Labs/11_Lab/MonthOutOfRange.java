public class MonthOutOfRange extends Exception{
    
    public MonthOutOfRange() {
        super("This isn't a valid month number!");
    }

    public MonthOutOfRange(int monthNumber) {
        super(monthNumber + " isn't a valid month number!");
    }

}
