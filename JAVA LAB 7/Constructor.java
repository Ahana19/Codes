// Base class
class Vehicle {
    private String model;
    private String color;
    private int year;

    // Parameterized constructor
    public Vehicle(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}

// Derived class
class Car extends Vehicle {
    private int numOfDoors;

    // Parameterized constructor that calls the base class constructor using super keyword
    public Car(String model, String color, int year, int numOfDoors) {
        super(model, color, year);
        this.numOfDoors = numOfDoors;
    }

    // Getter method
    public int getNumOfDoors() {
        return numOfDoors;
    }
}

// Main class to test the Car class
public class Constructor{
    public static void main(String[] args) {
        // Create a new Car object
        Car car = new Car("Ford", "Blue", 2021, 4);

        // Print the properties of the car object
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Year: " + car.getYear());
        System.out.println("Number of Doors: " + car.getNumOfDoors());
    }
}
