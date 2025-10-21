import java.util.*;
class printarray{
    static void  arrayprint(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class ques5{
    static int findFirstRepeated(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i]; // Return first duplicate found
                }    
            }
        }
        return -1; // Return -1 if no duplicates found
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in the array : ");
        int n= sc.nextInt();
        System.out.println("enter the array elements");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is ");
             printarray.arrayprint(arr);
             System.out.println();
            
         System.out.println("repeatinf first element is " +findFirstRepeated(arr));
    }
}