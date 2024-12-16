public class VehicleManagementSystem {
    public static void main(String[] args) {

        Vehicle newVehicle = new Vehicle("Subaru", "Crosstrek", "Automatic", true, 2017);
        newVehicle.displayInfo();
        Car newCar = new Car("Hyundai", "Tiburon", "Automatic", true, 2005, 2);
        newCar.displayInfo();
    }
}
