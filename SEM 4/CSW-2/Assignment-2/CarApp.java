import java.util.ArrayList;
import java.util.Collections;

class Car2 implements Comparable<Car2> {
    private int modelNo;
    private String name;
    private int stock;

    public Car2(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    public int getModelNo() {
        return modelNo;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public int compareTo(Car2 car) {
        return Integer.compare(this.stock, car.stock);
    }

    @Override
    public String toString() {
        return modelNo + " " + name + " " + stock;
    }
}
public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car2> cars = new ArrayList<>();
        cars.add(new Car2(2015, "BMW", 55));
        cars.add(new Car2(2017, "Audi", 45));
        cars.add(new Car2(2018, "Kia", 20));
        cars.add(new Car2(2020, "MG", 13));
        cars.add(new Car2(2013, "Creta", 10));

        // Sorting cars based on stock
        Collections.sort(cars);

        // Printing sorted list of cars
        System.out.println("Sorted list of cars:");
        for (Car2 car : cars) {
            System.out.println(car);
        }
    }
}
