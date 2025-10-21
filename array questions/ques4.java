import java.util.*;

class PrintArray {
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class ques4 {
    
    static int findFirstMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

   static void findsecondmax(int[] arr){
    int max = findFirstMax(arr);
    for(int i=0;i<arr.length;i++){
        if(arr[i]==max){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    int secondmax=findFirstMax(arr);

System.out.println("second max element in the array is " +secondmax);
   } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("The array is: ");
        PrintArray.printArray(arr);
        System.out.println(); // Add newline
        System.out.println("first element max in the arrays is" +findFirstMax(arr));
        findsecondmax(arr);
        
        sc.close(); // Good practice to close Scanner
    }
}