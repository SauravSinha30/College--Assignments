import java.util.Scanner;
public class ExtractNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input == null || input.isEmpty()) {
            throw new NullPointerException("Error: The input string cannot be null or empty.");
        }

        String numericChars = "";
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                numericChars += ch;
            }
        }
        if (!numericChars.isEmpty()) {
            System.out.println("Extracted numeric characters: " + numericChars);
        } else {
            System.out.println("No numeric characters found in the given string.");
        }
    }
}
