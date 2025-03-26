import java.util.Scanner;
public class Q5_NestedTryCatchExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Enter a number: ");
                String userInput = scanner.nextLine();
                int number = Integer.parseInt(userInput);

                try {
                    System.out.print("Enter a divisor: ");
                    int divisor = scanner.nextInt();
                    int result = number / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Inner Catch: Cannot divide by zero! " + e.getMessage());
                }
            } catch (NumberFormatException e) {
                System.out.println("Outer Catch: Invalid number format! Please enter a valid integer.");
            }


        }


}
