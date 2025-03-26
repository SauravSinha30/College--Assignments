import java.util.Scanner;
class CustomNullPointerException extends RuntimeException {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class Q2CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            if (input == null || input.isEmpty()) {
                throw new CustomNullPointerException("Error: Input cannot be null or empty.");
            }
            System.out.println("You entered: " + input);
        } catch (CustomNullPointerException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
