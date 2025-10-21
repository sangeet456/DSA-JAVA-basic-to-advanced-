import java.util.Scanner;

public class multiuserarray {
    static void printarray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no of rows : I.E m : ");
        int m=sc.nextInt();
        System.out.println("enter ther no of column i.e n : ");
        int n=sc.nextInt();
        int [][] arr=new int[m][n];
        System.out.println("enter the row element and column elements :\n");
        for(int i=0 ;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            arr[i][j]=sc.nextInt();        
        }
    }

sc.close();
        printarray(arr);
    }
    
}
