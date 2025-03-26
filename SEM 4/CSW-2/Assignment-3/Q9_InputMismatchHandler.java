import java.util.Scanner;
import java.util.InputMismatchException;
public class Q9_InputMismatchHandler {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter an integer: ");
                    number = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    scanner.next();
                }
            }
            System.out.println("You entered: " + number);
        }
}
