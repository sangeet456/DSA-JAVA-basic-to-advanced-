import java.util.Scanner;

public class matrixmulti{
static void addmatrix(int[][] a , int r1,int c1, int[][] b ,int r2, int c2){
    if(r1!=r2|| c1!=c2){
        System.out.println("wrong input addition not possible"  );
    return; 
}
 int[][] sum = new int[r1][c1];
 for(int i=0;i<r1;i++){//row
    for(int j=0;j<c1;j++){//col
        sum[i][j]=a[i][j]+b[i][j];

 }
}

}



static void printarray(int [][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[i][j]+" ");
        }
    } System.out.println();
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the ros : ");
    int r=sc.nextInt();
    System.out.println("enter the cols : ");
    int c=sc.nextInt();
    System.out.println("enter the r and cs of the matrix ONE :: ");
    int[][] arr1= new int[r][c];
    for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr1.length;j++){
        arr1[i][j]=sc.nextInt();
    }
    }

printarray(arr1);
 System.out.println("enter the ros : ");
    int m=sc.nextInt();
    System.out.println("enter the cols : ");
    int n=sc.nextInt();
 System.out.println("enter the r and cs of the matrix TWO  :: ");
    int[][] arr2= new int[m][n];
    for(int i=0;i<arr2.length;i++){
    for(int j=0;j<arr2.length;j++){
        arr2[i][j]=sc.nextInt();
    }
    }
    sc.close();
    printarray(arr2);

 addmatrix(arr1, r, c, arr2, r, c);
}}