import java.util.Arrays;
import java.util.Scanner;

public class referencearray{

    static void printarray(int[] arr){
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"  ");
    }
    System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements of the array to print : ");
        int n=sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the elements for the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(" the array is ");
        printarray(arr);
       
        int[] arr_2 = Arrays.copyOf(arr, arr.length);
        arr_2[0]=998;
        arr_2[1]=887;
        printarray(arr_2);
    }

}