class CargoShip extends Ship {
    int maxTonnage;

    public CargoShip(String name, String buildYear, int maxTonnage) {
        super(name, buildYear);
        this.maxTonnage = maxTonnage;
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
                           "\nCargo maxTonnage: " + this.getmaxTonnage();

        return(cargoShip);
    }
}