import java.util.Scanner;
public class Q7_MatrixOperations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of rows for matrices: ");
            int rows = scanner.nextInt();
            System.out.print("Enter number of columns for matrices: ");
            int cols = scanner.nextInt();
            int[][] matrixA = new int[rows][cols];
            int[][] matrixB = new int[rows][cols];
            int[][] sumMatrix = new int[rows][cols];
            System.out.println("Enter elements of Matrix A:");
            fillMatrix(scanner, matrixA);
            System.out.println("Enter elements of Matrix B:");
            fillMatrix(scanner, matrixB);
            try {
                sumMatrix = addMatrices(matrixA, matrixB);
                System.out.println("Sum of Matrices:");
                printMatrix(sumMatrix);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error in addition: " + e.getMessage());
            }
            try {
                System.out.println("Matrix Multiplication:");
                int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
                printMatrix(productMatrix);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error in multiplication: " + e.getMessage());
            }
            try {
                System.out.println("Transpose of Matrix A:");
                int[][] transposeMatrix = transposeMatrix(matrixA);
                printMatrix(transposeMatrix);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error in transpose: " + e.getMessage());
            }
            try {
                System.out.print("Enter row index to access: ");
                int r = scanner.nextInt();
                System.out.print("Enter column index to access: ");
                int c = scanner.nextInt();
                System.out.println("Element at [" + r + "][" + c + "]: " + matrixA[r][c]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception Caught: Invalid index! Matrix index is out of bounds.");
            }

        }
        private static void fillMatrix(Scanner scanner, int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }
        private static int[][] addMatrices(int[][] A, int[][] B) {
            int rows = A.length, cols = A[0].length;
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = A[i][j] + B[i][j];
                }
            }
            return result;
        }
        private static int[][] multiplyMatrices(int[][] A, int[][] B) {
            int rows = A.length, cols = B[0].length;
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    for (int k = 0; k < A[0].length; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            return result;
        }
        private static int[][] transposeMatrix(int[][] matrix) {
            int rows = matrix.length, cols = matrix[0].length;
            int[][] transpose = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }
            return transpose;
        }
        private static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
}
