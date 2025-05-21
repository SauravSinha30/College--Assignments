class SumThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of first 100 natural numbers: " + sum);
    }
}

class TableThread extends Thread {
    private int number;

    public TableThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}



public class Q1 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        TableThread tableThread = new TableThread(5); // You can change the number here

        sumThread.start();
        tableThread.start();
    }

}













