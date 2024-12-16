class Vehicle {

    String make;
    String model;
    String transmission;
    boolean cleanTitle;
    int year;

    public Vehicle(String make, String model, String transmission,
            boolean cleanTitle, int year) {
        this.make = make;
        this.model = model;
        this.transmission = transmission;
        this.cleanTitle = cleanTitle;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getTitle() {
        if (cleanTitle) {
            return "Clean";
        } else {
            return "Rebuilt";
        }
    }

    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + "| Model: " + model + "| Year: " + year
                + "| Transmission: " + transmission + "| Title: " + getTitle() + "|");
    }

}