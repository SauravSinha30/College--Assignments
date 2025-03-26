import java.util.Arrays;
import java.util.Scanner;
public class Q6_ArrayManipulation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = {12, 5, 8, 20, 3, 7};
            Arrays.sort(numbers);
            System.out.println("Sorted Array: " + Arrays.toString(numbers));
            System.out.print("Enter a number to search: ");
            int target = scanner.nextInt();
            boolean found = false;
            for (int num : numbers) {
                if (num == target) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "Element found!" : "Element not found.");
            try {
                System.out.print("Enter an index to access: ");
                int index = scanner.nextInt();
                System.out.println("Element at index " + index + ": " + numbers[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception Caught: Invalid index! Array index is out of bounds.");
            }
            System.out.println("Program executed successfully.");
        }
    }


