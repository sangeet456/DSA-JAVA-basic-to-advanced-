import java.util.Scanner;

public class transpose2 {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // This only works for square matrices
    static void transposeInPlace(int[][] matrix, int r,int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i + 1; j < r; j++) { // Start from i+1 to avoid swapping twice
                // Swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and cols in matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter the total elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix:");
        printMatrix(matrix);
            System.out.println("transpose of matrix");
      transposeInPlace(matrix, c,r);
   printMatrix(matrix);

        sc.close();
    }
}
