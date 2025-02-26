import java.util.LinkedList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer>[] a = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            a[i] = new LinkedList<Integer>();
        }
        a[0].add(1);
        a[0].add(2);
        a[1].add(2);
        a[2].add(3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(i+" : "+a[i]);
        }
    }
}
