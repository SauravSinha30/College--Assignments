import java.util.Scanner;
public class Q3_StringToIntegerConverter {
        public static int convertStringToInt(String input) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid numeric value.");
                return -1;
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number;

            while (true) {
                System.out.print("Enter a numeric value: ");
                String userInput = scanner.nextLine();
                number = convertStringToInt(userInput);
                if (number != -1) {
                    break;
                }
            }
            System.out.println("You entered the valid number: " + number);
            scanner.close();
        }

}

