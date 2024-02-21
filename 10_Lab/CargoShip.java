class CargoShip extends Ship {
    int capacity;

    public CargoShip(String name, String buildYear, int capacity) {
        super(name, buildYear);
        this.capacity = capacity;
    }

    /**
     * Setters
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Getters
     */
    public int getCapacity() {
        return(this.capacity);
    }

    /**
     * String representation
     */
    @Override
    public String toString() {
        String cargoShip = super.toString() +
                           "\nCargo Capacity: " + this.getCapacity();

        return(cargoShip);
    }
}