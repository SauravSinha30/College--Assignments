import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        List<String> s=new ArrayList<>();
        s.add("Banana");
        s.add("Apple");
        s.add("Watermelon");
        s.add("Kiwi");
        s.add("Orange");

        s.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

        System.out.println("Sorted strings by length (descending):");
        System.out.println(s);


    }
}
