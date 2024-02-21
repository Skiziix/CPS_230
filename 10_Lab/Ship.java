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
     * Getters
     */
    public String getName() {
        return(this.name);
    }

    public String getBuildYear() {
        return(this.buildYear);
    }

    public String toString() {
        String ship = "\nBuild Year: " + this.buildYear +
                      "\nName: " + this.name;

        return(ship);
    }
    

}