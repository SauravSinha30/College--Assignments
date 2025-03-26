class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
public class Q8_CustomExceptionDemo {
        public static void checkPositiveNumber(int number) throws CustomCheckedException {
            if (number < 0) {
                throw new CustomCheckedException("Error: Negative numbers are not allowed.");
            } else {
                System.out.println("Valid number: " + number);
            }
        }
        public static void main(String[] args) {
            int[] testNumbers = {10, -5, 20};
            for (int num : testNumbers) {
                try {
                    checkPositiveNumber(num);
                } catch (CustomCheckedException e) {
                    System.out.println("Exception Caught: " + e.getMessage());
                }
            }
        }
}
