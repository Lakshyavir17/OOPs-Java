class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType,
        int numberOfSeats, boolean ACavailable) {

        super(vehicleNumber, brand, fuelType); // constructor chaining
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    void displayDetails() {
        super.displayDetails(); // call parent method
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;
    private int chargingTime;

    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int numberOfSeats, boolean ACavailable,
                int batteryCapacity, int chargingTime) {

        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

public class Practical25 {
    public static void main(String[] args) {

        
        Vehicle v1 = new Vehicle("GJ01AB1234", "Tata", "Petrol");
        System.out.println("Vehicle Details:");
        v1.displayDetails();

        
        Car c1 = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);
        System.out.println("\nCar Details:");
        c1.displayDetails();

       
        ElectricCar e1 = new ElectricCar("GJ03EF9012", "Tesla", "Electric",
                                        5, true, 75, 2);
        System.out.println("\nElectric Car Details:");
        e1.displayDetails();

        
        Vehicle v2 = new Car("GJ04GH3456", "Honda", "Petrol", 5, true);
        System.out.println("\nUpcasting Example:");
        v2.displayDetails();  
       
        if (v2 instanceof Car) {
            Car c2 = (Car) v2;
            System.out.println("\nDowncasting Successful:");
            System.out.println("Seats in Car: " + c2.numberOfSeats);
        }
    }
}