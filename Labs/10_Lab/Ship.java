class Ship {
    String name;
    String buildYear;

    /**
     * Constructor
     * @param name the name of the ship
     * @param buildYear the year the ship was built
    **/   
    public Ship(String name, String buildYear) {
        this.name = name;
        this.buildYear = buildYear;
        
    }


    /**
     * Setters
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    /**
     * Getters
     */
    public String getName() {
        return(this.name);
    }

    public String getBuildYear() {
        return(this.buildYear);
    }

    /**
     * String representation
     */
    public String toString() {
        String ship = "\nBuild Year: " + this.buildYear +
                      "\nName: " + this.name;

        return(ship);
    }
    

}