interface Vehicle {
    void accelerate();
    void brake();
}

class Car1 implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }

    // Method overloading: accelerate with different parameters
    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating to " + speed + " km/h for " + duration + " seconds.");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }

    // Method overloading: accelerate with different parameters
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h for " + duration + " seconds.");
    }
}
public class VehicleApp {
    public static void main(String[] args) {
        Vehicle car = new Car1();
        Vehicle bicycle = new Bicycle();

        System.out.println("Testing overridden methods:");
        car.accelerate();
        car.brake();
        bicycle.accelerate();
        bicycle.brake();

        System.out.println("\nTesting overloaded methods:");
        Car1 specificCar = new Car1();
        Bicycle specificBicycle = new Bicycle();

        specificCar.accelerate();
        specificCar.accelerate(60);
        specificCar.accelerate(80, 10);

        System.out.println();

        specificBicycle.accelerate();
        specificBicycle.accelerate(20);
        specificBicycle.accelerate(25, 5);
    }
}
