
public class Q3 {
    public static void main(String[] args) {
        int a = 20, b = 5; // You can change these values

        // Addition using lambda
        Runnable addition = () -> System.out.println("Addition: " + (a + b));

        // Subtraction using lambda
        Runnable subtraction = () -> System.out.println("Subtraction: " + (a - b));

        // Multiplication using lambda
        Runnable multiplication = () -> System.out.println("Multiplication: " + (a * b));

        // Division using lambda
        Runnable division = () -> {
            if (b != 0) {
                System.out.println("Division: " + (a / b));
            } else {
                System.out.println("Division: Cannot divide by zero!");
            }
        };

        // Creating threads for each task
        Thread addThread = new Thread(addition);
        Thread subThread = new Thread(subtraction);
        Thread mulThread = new Thread(multiplication);
        Thread divThread = new Thread(division);

        // Starting threads
        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();
    }
}
