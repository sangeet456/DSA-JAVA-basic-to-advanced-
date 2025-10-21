import java.util.Scanner;

public class MatrixMultiplication {

    static void printMatrix(int[][] matrix, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void matrixMultiply(int[][] a, int[][] b, int r1, int c1, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible: wrong dimensions");
            return;
        }
        
        int mul[][] = new int[r1][c2]; // initialization of the multiplication matrix
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                // multiplication of i,j element
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }

        System.out.println("Multiplication of 2 matrices:");
        printMatrix(mul, r1, c2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // First matrix input
        System.out.println("Enter the rows for matrix ONE: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the columns for matrix ONE: ");
        int c1 = sc.nextInt();
        
        System.out.println("Enter the elements of matrix ONE:");
        int[][] arr1 = new int[r1][c1];
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matrix ONE:");
        printMatrix(arr1, r1, c1);
        
        // Second matrix input
        System.out.println("Enter the rows for matrix TWO: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the columns for matrix TWO: ");
        int c2 = sc.nextInt();
        
        System.out.println("Enter the elements of matrix TWO:");
        int[][] arr2 = new int[r2][c2];
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matrix TWO:");
        printMatrix(arr2, r2, c2);
        
        // Matrix multiplication
        matrixMultiply(arr1, arr2, r1, c1, r2, c2);
        
        sc.close();
    }
}