import java.util.HashMap;

public class SmallestMisisingNumber {
    public static int findSmallestMissingNumber(int[] numbers) {
        HashMap<Integer, Boolean> numberMap = new HashMap<>();

        for (int num : numbers) {
            numberMap.put(num, true);
        }

        for (int i = 1; i <= 10; i++) {
            if (!numberMap.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 2, 8, 5, 4, 10};
        int missingNumber = findSmallestMissingNumber(numbers);
        System.out.println("The smallest positive number missing in the array is: " + missingNumber);
    }
}
