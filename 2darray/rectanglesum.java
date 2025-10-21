import java.util.Scanner;

public class rectanglesum {
    static void printmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int findsum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {  // Changed to <= l2 to include the last row
            for (int j = r1; j <= r2; j++) {  // Changed to <= r2 to include the last column
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("Enter l1, r1, l2, r2 (top-left and bottom-right coordinates)");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        
        int[][] a = new int[r][c];
        System.out.println("Enter the matrix elements ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The original matrix:");
        printmatrix(a);
        System.out.println("Sum of rectangle: " + findsum(a, l1, r1, l2, r2));
    }
}