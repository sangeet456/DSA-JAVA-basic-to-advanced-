import java.util.Scanner;

class PrintMatrix {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  " );
            }
            System.out.println();
        }
   
    }
}

public class spiraln2 {
    

    static void printSpiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;

        while (totalElements < r * c) {
            // Top row: left to right
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // Right column: top to bottom
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // Bottom row: right to left
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // Left column: bottom to top
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("Enter the elements of the matrix:");
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Input matrix:\n");
        PrintMatrix.printMatrix(a);
        
        System.out.println("Spiral order:");
        printSpiralOrder(a, r, c);
        
        sc.close();
    }
}