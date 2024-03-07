class Month {

    enum allMonths {
                 January, Feburary, March, April,
                 May, June, July, August,
                 September, October, November, December
                };

    allMonths month;

    public Month() {
        this.setMonth(1);
    }

    public Month(int month) throws MonthOutOfRange {

        if (month < 0 || month > 11) 
            throw new MonthOutOfRange(month + 1);

        this.setMonth(month);
    }

    // Fill this out
    public Month(String monthName) {
        this.month = allMonths.valueOf(monthName);
    }

    public int getMonthNumber() {
        return this.month.ordinal() + 1;
    }
    
    public String getMonthName() {
        return this.month.name();
    }

    public void setMonth(int monthNumber) {
        this.month = allMonths.values()[monthNumber + 1];
    }

    public boolean equals(Month otherMonth) {
        boolean result = (this.getMonthNumber() == otherMonth.getMonthNumber()) ? true : false;

        return result;

    }

    public boolean greaterThan(Month otherMonth) {
        boolean result = (this.getMonthNumber() > otherMonth.getMonthNumber()) ? true : false;

        return result;
    }

    public boolean lessThan(Month otherMonth) {
        boolean result = (this.getMonthNumber() < otherMonth.getMonthNumber()) ? true : false;

        return result;
    }

    public String toString() {
        String monthString = "Month Name: " + this.getMonthNumber() + "\n" + 
                             "Month Name: " + this.getMonthName() + "\n";

        return monthString;
    }

    
}