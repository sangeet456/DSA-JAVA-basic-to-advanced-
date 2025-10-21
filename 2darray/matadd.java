import java.util.Scanner;

public class matadd {

    public static class printmatrix {
        static void printmatrix1(int[][] matrix) {
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");  // Changed from \n to space
                }
                System.out.println();  // Add newline after each row
            }
        }
    }

    static void matrixadd(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if(r1 != r2 || c1 != c2) {
            System.out.println("Matrix addition is not possible");
            return;
        }
        
        int[][] sum = new int[r1][c1];
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        
        System.out.println("Sum of matrices:");
        printmatrix.printmatrix1(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for first matrix
        System.out.println("Enter the number of rows and columns for matrix 1:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        
        System.out.println("Enter the elements of matrix 1:");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        // Input for second matrix
        System.out.println("Enter the number of rows and columns for matrix 2:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        
        System.out.println("Enter the elements of matrix 2:");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        
        // Print both matrices
        System.out.println("Matrix 1:");
        printmatrix.printmatrix1(a);
        
        System.out.println("Matrix 2:");
        printmatrix.printmatrix1(b);
        
        // Add matrices
        matrixadd(a, r1, c1, b, r2, c2);
        
        sc.close();
    }
}