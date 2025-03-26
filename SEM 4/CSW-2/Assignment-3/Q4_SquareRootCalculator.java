import java.util.Scanner;
public class Q4_SquareRootCalculator {
        public static void calculateSquareRoot(int number) {
            try {
                if (number < 0) {
                    throw new ArithmeticException("Cannot calculate square root of a negative number.");
                }
                double result = Math.sqrt(number);
                System.out.println("The square root of " + number + " is: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Exception Caught: " + e.getMessage());
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            calculateSquareRoot(num);


        }
}
