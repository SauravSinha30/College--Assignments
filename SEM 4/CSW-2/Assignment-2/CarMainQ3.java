class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }
    @Override
    public String toString() {
        return "Car Model: " + model + ", Color: " + color + ", Speed: " + speed + " km/h";
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.speed, other.speed);
    }
}

public class CarMainQ3 {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model S", "Red", 200);
        Car car2 = new Car("BMW M3", "Blue", 250);
        System.out.println("Car Details:");
        System.out.println(car1);
        System.out.println(car2);

        Car fasterCar = (car1.compareTo(car2) > 0) ? car1 : car2;
        System.out.println("\nThe car with the greater speed:");
        System.out.println(fasterCar);
    }
}
