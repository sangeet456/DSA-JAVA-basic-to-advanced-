import java.util.Scanner;

public class transpose {



    static void printmatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
    }

    static int[][] transposemat(int [][] matrix ,int r,int c){
              int ans[][] =new int[c][r];
              for(int i=0;i<c;i++){
                for(int j=0;j<r;j++){
                    ans[i][j]=matrix[j][i];
                }
              }
     return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows and cols in matrix");
        int r=sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int [r][c];
        
        System.out.println("enter the total elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println( "input matrix");
        printmatrix(matrix);

        System.out.println("transpose of matrix :: ");
        int ans[][] = transposemat(matrix, r, c);
    printmatrix(ans); 
    sc.close();   
    }
    
}
