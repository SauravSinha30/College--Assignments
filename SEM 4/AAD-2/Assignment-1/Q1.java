import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertex: ");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        System.out.println("Enter vertices with an edge: ");
        boolean choice = true;
        while(choice) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == -1 && b == -1) break;
            addEdge(a-1, b-1, matrix);
        }
        System.out.println("Graph representated using Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i] [j]+"  ");
            }
            System.out.println();
        }
    }
    public static void addEdge(int i, int j, int[][] matrix) {
        matrix[i][j]=1;
        matrix[j][i]=1;
    }
}
