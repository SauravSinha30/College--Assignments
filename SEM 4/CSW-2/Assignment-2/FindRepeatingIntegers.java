import java.util.HashSet;
public class FindRepeatingIntegers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 6, 3, 7, 4, 8, 5};

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        HashSet<Integer> repeatingNumbers = new HashSet<>();

        for (int num : numbers) {
            if (!uniqueNumbers.add(num)) {
                repeatingNumbers.add(num);
            }
        }

        System.out.println("Repeating integers are: " + repeatingNumbers);
    }
}
