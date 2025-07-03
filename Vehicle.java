// Base class - Inheritance
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting.");
    }
}

// Composition - Engine is part of Car
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void ignite() {
        System.out.println("Engine of type " + type + " is igniting.");
    }
}

// Aggregation - Driver can exist independently of Car
class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public void drive() {
        System.out.println(name + " is driving.");
    }
}

// Inheritance + Composition + Aggregation
class Car extends Vehicle {
    private Engine engine; // Composition
    private Driver driver; // Aggregation

    public Car(String brand, Engine engine, Driver driver) {
        super(brand);
        this.engine = engine;
        this.driver = driver;
    }

    public void driveCar() {
        engine.ignite();
        driver.drive();
        super.start();
        System.out.println("Car is moving.");
    }
}

// Another subclass using Inheritance only
class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }

    public void ride() {
        System.out.println("Riding the bike.");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine("V8");
        Driver alice = new Driver("Alice");

        Car car = new Car("Toyota", carEngine, alice);
        car.driveCar();

        System.out.println("\n---\n");

        Bike bike = new Bike("Yamaha");
        bike.start();
        bike.ride();
    }
}
