class CargoShip extends Ship {
    int maxTonnage;

    /**
     * Constructor
     * @param name the name of the ship
     * @param buildYear the year that the ship was built
     * @param maxTonnage the maximum weight of cargo that a cargo ship can carry
     */
    public CargoShip(String name, String buildYear, int maxTonnage) {
        super(name, buildYear);
        this.setmaxTonnage(maxTonnage);
    }

    /**
     * Setters
     */
    public void setmaxTonnage(int maxTonnage) {
        this.maxTonnage = maxTonnage;
    }

    /**
     * Getters
     */
    public int getmaxTonnage() {
        return(this.maxTonnage);
    }

    /**
     * String representation
     */
    @Override
    public String toString() {
        String cargoShip = super.toString() +
                           "\nCargo Max Tonnage: " + this.getmaxTonnage();

        return(cargoShip);
    }
}