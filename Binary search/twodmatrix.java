import java.util.Scanner;

public class twodmatrix{

static boolean chutfinder(int[][] arr, int target)
{
//number of rows as n and no of cols as m
    int n=arr.length;
    int m = arr[0].length;

    int st=0,end=n*m-1;

    while(st<=end){
        int mid =(st+end)/2;
        int midelt =arr[mid/m][mid%m];
        if(midelt==target){
            return true;
        }
        else if(target>midelt){
            end=mid-1;

        }
        else{
            st=mid+1;
        }
        

    }
    
return false;
}



    static void printarray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
    System.out.println();
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows in array :");
        int m=sc.nextInt();
        System.out.println("enter the no of cols in array :");
        int n=sc.nextInt();
        System.out.println("Enter the array elements : ");
        int[][] arr= new int[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }

        }
        System.out.println("the original array: ");

        printarray(arr);
    int target = sc.nextInt();
    System.out.println(chutfinder(arr, target));
    sc.close();
    }

    
}
