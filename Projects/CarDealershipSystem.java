import java.util.Scanner;

class Vehicle {
    private String make;
    private String model;
    private int year;
    private double price;

    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + " - $" + price;
    }
}

class Dealership {
    private Vehicle[] inventory;
    private int count;

    public Dealership(int capacity) {
        inventory = new Vehicle[capacity];
        count = 0;
    }

    public boolean addVehicle(Vehicle vehicle) {
        if (count < inventory.length) {
            inventory[count] = vehicle;
            count++;
            return true;
        }
        return false;
    }

    public Vehicle[] getInventory() {
        return inventory;
    }

    public int getCount() {
        return count;
    }

    public void decrementCount() {
        count--;
    }
}

public class CarDealershipSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dealership dealership = new Dealership(100);

        while (true) {
            System.out.println("Car Dealership System");
            System.out.println("1. Employee Page");
            System.out.println("2. Customer Page");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    employeePage(dealership);
                    break;
                case 2:
                    customerPage(dealership);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void employeePage(Dealership dealership) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Employee Page");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Inventory");
            System.out.println("3. Back");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addVehicle(dealership);
                    break;
                case 2:
                    viewInventory(dealership);
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addVehicle(Dealership dealership) {
        Scanner scanner = new Scanner(System.in);

        if (dealership.getCount() == dealership.getInventory().length) {
            System.out.println("Inventory is full. Cannot add more vehicles.");
            scanner.close();
            return;
        }

        System.out.print("Enter the make: ");
        String make = scanner.next();

        System.out.print("Enter the model: ");
        String model = scanner.next();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();

        Vehicle vehicle = new Vehicle(make, model, year, price);
        if (dealership.addVehicle(vehicle)) {
            System.out.println("Vehicle added to inventory.");
        } else {
            System.out.println("Inventory is full. Cannot add more vehicles.");
        }
        scanner.close();
    }

    private static void viewInventory(Dealership dealership) {
        Vehicle[] inventory = dealership.getInventory();
        System.out.println("Inventory:");

        for (int i = 0; i < dealership.getCount(); i++) {
            System.out.println((i + 1) + ". " + inventory[i]);
        }
    }

    private static void customerPage(Dealership dealership) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] inventory = dealership.getInventory();
        int count = dealership.getCount();

        if (count == 0) {
            System.out.println("No vehicles available in the inventory.");
            scanner.close();
            return;
        }

        System.out.println("Customer Page");
        System.out.println("Available Vehicles:");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + inventory[i]);
        }

        System.out.print("Enter the number of the vehicle you want to buy (0 to go back): ");
        int choice = scanner.nextInt();

        if (choice == 0) {
            scanner.close();
            return;
        }

        if (choice >= 1 && choice <= count) {
            Vehicle selectedVehicle = inventory[choice - 1];
            System.out.println("Congratulations! You've purchased the following vehicle:");
            System.out.println(selectedVehicle);
            removeVehicle(dealership, selectedVehicle);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
        scanner.close();
    }

    private static void removeVehicle(Dealership dealership, Vehicle vehicle) {
        Vehicle[] inventory = dealership.getInventory();
        int count = dealership.getCount();

        for (int i = 0; i < count; i++) {
            if (inventory[i] == vehicle) {
                // Shift remaining vehicles to fill the gap.
                for (int j = i; j < count - 1; j++) {
                    inventory[j] = inventory[j + 1];
                }
                inventory[count - 1] = null;
                dealership.decrementCount();
                break;
            }
        }
    }
}
