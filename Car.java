class Car extends Vehicle {
    private int numOfDoors;
    private String fuelType;

    // Constructor
    public Car(String make, String model, String transmission,
            boolean cleanTitle, int year, int numOfDoors) {
        super(make, model, transmission, cleanTitle, year);
        this.numOfDoors = numOfDoors;
    }

    public Car(String make, String model, String transmission,
            boolean cleanTitle, int year, int numOfDoors, String fuelType) {
        super(make, model, transmission, cleanTitle, year);
        this.numOfDoors = numOfDoors;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void displayInfo() {
        if (fuelType == null) {
            fuelType = "Gas";
        }
        System.out.println("Make: " + make + "| Model: " + model + "| Year: " + year
                + "| Transmission: " + transmission + "| Title: " + getTitle() + "| Doors: "
                + numOfDoors + "| Fuel Type: " + fuelType + "|");
    }
}
