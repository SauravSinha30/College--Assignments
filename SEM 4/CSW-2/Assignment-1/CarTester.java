class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" + "make='" + make + '\'' + ", model='" + model + '\'' + '}';
    }

}
public class CarTester {
    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Corolla");
        Car myCar2 = new Car(null, null);


        System.out.println("myCar1:");
        System.out.println(myCar1);
        System.out.println("myCar2:");
        System.out.println(myCar2);

        myCar2.setMake("Honda");
        myCar2.setModel("Civic");

        System.out.println("Updated myCar2:");
        System.out.println(myCar2);

    }

}
