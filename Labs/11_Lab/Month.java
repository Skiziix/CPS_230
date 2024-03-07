class Month {

    // Enum to hold month names and numbers - 1
    enum allMonths {
                 January, Feburary, March, April,
                 May, June, July, August,
                 September, October, November, December
                };

    // To hold an object's month
    allMonths month;

    /****************
     * Constructors *
     ****************/

    // No-arg
    public Month() {
        this.setMonth(1);
    }

    // Month number throws MonthOutOfRange if not 1 > x < 12
    public Month(int month) throws MonthOutOfRange {

        // Checks if in correct range
        if (month < 1 || month > 12) 
            throw new MonthOutOfRange(month); // Throws error

        // If in range sets month
        this.setMonth(month);
    }

    // Month Name throws InvalidMonthName if a string is passed not in enum type
    public Month(String monthName) throws InvalidMonthName{

        /*
         * Try Catch Block catches
         * a bad argument and throws the 
         * InvalidMonthName error
         */
        try { 
            this.setMonth(monthName); // Setting month name
        } 

        catch (IllegalArgumentException e) {
            throw new InvalidMonthName(monthName); // Throwing error
        }

    }

    /* *********
     * Getters *
     ***********/

    // The month number
    public int getMonthNumber() {
        return this.month.ordinal() + 1;
    }
    
    // The month name
    public String getMonthName() {
        return this.month.name();
    }


    /***********
     * Setters *
     ***********/

    // Name setter
    public void setMonth(String monthName) {
        this.month = allMonths.valueOf(monthName);
    }

    // Number setter
    public void setMonth(int monthNumber) {
        this.month = allMonths.values()[--monthNumber];
    }

    /**************
     * Comparison *
     **************/

    // Objects equal
    public boolean equals(Month otherMonth) {
        boolean result = (this.getMonthNumber() == otherMonth.getMonthNumber()) ? true : false;

        return result;

    }

    // This object greater
    public boolean greaterThan(Month otherMonth) {
        boolean result = (this.getMonthNumber() > otherMonth.getMonthNumber()) ? true : false;

        return result;
    }

    // This object less-than
    public boolean lessThan(Month otherMonth) {
        boolean result = (this.getMonthNumber() < otherMonth.getMonthNumber()) ? true : false;

        return result;
    }


    /*************************
     * String Representation *
     *************************/
    public String toString() {
        String monthString = "Month Number: " + this.getMonthNumber() + "\n" + 
                             "Month Name: " + this.getMonthName() + "\n";

        return monthString;
    }

    
}