import java.util.Scanner;

public class selection{

    static void selectsort(int [] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               if(arr[i]>arr[j]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }
    }


    static void printarray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
printarray(arr);
System.out.println("sorted array by selection sort");
selectsort(arr);
System.out.println();
printarray(arr);
       sc.close();;
    }
}