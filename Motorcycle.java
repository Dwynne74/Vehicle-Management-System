class Motorcycle extends Vehicle {
    int wheels;

    public Motorcycle(String make, String model, String transmission,
            boolean cleanTitle, int year, int wheels) {
        super(make, model, transmission, cleanTitle, year);
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + "| Model: " + model + "| Year: " + year
                + "| Transmission: " + transmission + "| Title: " + getTitle() + "| Wheels:"
                + wheels + "|");
    }
}
