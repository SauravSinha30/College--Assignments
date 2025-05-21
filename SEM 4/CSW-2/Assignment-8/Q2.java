// Thread for Addition
class AdditionThread extends Thread {
    private int a, b;

    public AdditionThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Addition: " + (a + b));
    }
}
// Thread for Subtraction
class SubtractionThread extends Thread {
    private int a, b;

    public SubtractionThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Subtraction: " + (a - b));
    }
}
// Thread for Multiplication
class MultiplicationThread extends Thread {
    private int a, b;

    public MultiplicationThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Multiplication: " + (a * b));
    }
}
// Thread for Division
class DivisionThread extends Thread {
    private int a, b;

    public DivisionThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: Cannot divide by zero!");
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        int x = 20, y = 5; // You can change the values

        AdditionThread add = new AdditionThread(x, y);
        SubtractionThread sub = new SubtractionThread(x, y);
        MultiplicationThread mul = new MultiplicationThread(x, y);
        DivisionThread div = new DivisionThread(x, y);

        add.start();
        sub.start();
        mul.start();
        div.start();
    }
}
