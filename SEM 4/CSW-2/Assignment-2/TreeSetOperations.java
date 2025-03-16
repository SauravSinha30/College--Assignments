import java.util.Scanner;
import java.util.TreeSet;
public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        System.out.println("Elements of the TreeSet:");
        for (Integer number : treeSet) {
            System.out.println(number);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a number to check its presence in the TreeSet:");
        int numberToCheck = scanner.nextInt();
        if (treeSet.contains(numberToCheck)) {
            System.out.println("The number " + numberToCheck + " is present in the TreeSet.");
        } else {
            System.out.println("The number " + numberToCheck + " is not present in the TreeSet.");
        }

        System.out.println("\nEnter a number to remove from the TreeSet:");
        int numberToRemove = scanner.nextInt();
        if (treeSet.remove(numberToRemove)) {
            System.out.println("The number " + numberToRemove + " has been removed from the TreeSet.");
        } else {
            System.out.println("The number " + numberToRemove + " is not present in the TreeSet.");
        }

        System.out.println("\nUpdated TreeSet:");
        for (Integer number : treeSet) {
            System.out.println(number);
        }
    }
}
