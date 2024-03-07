public class InvalidMonthName extends Exception{
    
    public InvalidMonthName() {
        super("Please retype the month. That was invalid!");
    }

    public InvalidMonthName(String monthName) {
        super(monthName + " is an invalid month. Please retype!");
    }
}
