class CruiseShip extends Ship {

    int maxPassengers;

    /**
     * Constructor
     * @param name
     * @param buildYear
     * @param maxPassengers
     */

    public CruiseShip(String name, String buildYear, int maxPassengers) {
        super(name, buildYear);
        this.maxPassengers = maxPassengers;
    } 

    /**
     * Setters
     */
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

     /** 
      * Getters
      */
    public int getMaxPassengers() {
        return(this.maxPassengers);
    }

    /**
     * String representation
     */
    @Override
    public String toString() {
        String cruiseShip = super.toString() + 
                            "\nMaximum Number of Passengers: " + this.getMaxPassengers();
                        
        return(cruiseShip);
    }

}