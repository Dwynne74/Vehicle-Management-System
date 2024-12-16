import java.util.Scanner;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which type of vehicle would you like to manage?"
                + "(Input 1 for Car and 2 for Motorcycle): ");
        int userOption = scanner.nextInt();
        scanner.nextLine();

        if (userOption == 1) {
            System.out.print("What is the make of the car?: ");
            String userMake = scanner.next();
            System.out.print("What is the model of the car?: ");
            String userModel = scanner.next();
            System.out.print("What is the transmission of the car?: ");
            String userTransmission = scanner.next();
            System.out.print("Does it have a clean title:(Enter true for yes and false for no) ");
            boolean userTitle = scanner.nextBoolean();
            System.out.print("What is the year of the car?: ");
            int userYear = scanner.nextInt();
            System.out.print("How many doors?: ");
            int userCarDoors = scanner.nextInt();

            String userFuelType = null;
            while (true) {
                System.out.print("Do you know the fuel type of the car?(Type 1 for yes and 2 for no): ");
                int userAnswer = scanner.nextInt();
                if (userAnswer == 1) {
                    System.out.print("What is the fuel type of the car?: ");
                    userFuelType = scanner.next();
                    break;
                } else if (userAnswer == 2) {
                    break;
                } else {
                    System.out.println("You entered an invalid input. Please try again.");
                }
            }

            Car newCar = new Car(userMake, userModel, userTransmission, userTitle, userYear, userCarDoors,
                    userFuelType);
            newCar.displayInfo();
        } else if (userOption == 2) {
            System.out.print("What is the make of the motorcycle?: ");
            String userMake = scanner.next();
            System.out.print("What is the model of the motorcycle?: ");
            String userModel = scanner.next();
            System.out.print("What is the transmission of the motorcycle?: ");
            String userTransmission = scanner.next();
            System.out.print("Does it have a clean title:(Enter true for yes and false for no) ");
            boolean userTitle = scanner.nextBoolean();
            System.out.print("What is the year of the motorcycle?: ");
            int userYear = scanner.nextInt();
            System.out.print("How many wheels does the motorcycle have?: ");
            int userWheels = scanner.nextInt();

            Motorcycle newMotorcycle = new Motorcycle(userMake, userModel, userTransmission, userTitle, userYear,
                    userWheels);
            newMotorcycle.displayInfo();
        } else {
            System.out.println("You entered an invalid input.");
        }

        scanner.close();
    }
}
