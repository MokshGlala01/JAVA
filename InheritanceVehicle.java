import java.util.Scanner;

class Vehicle {
    String make;
    String model;

    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String make, String model, String fuelType) {
        super(make, model);  
        this.fuelType = fuelType;
    }

    @Override
    void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Fuel Type: " + fuelType);
    }
}

public class InheritanceVehicle {
    public static void main(String[] args) {
         System.out.println("Moksh Gala BS16 CSE");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car Make: ");
        String make = sc.nextLine();

        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Fuel Type: ");
        String fuelType = sc.nextLine();

        Car car = new Car(make, model, fuelType);

        System.out.println("\n--- Car Information ---");
        car.displayInfo();

        sc.close();
    }
}
