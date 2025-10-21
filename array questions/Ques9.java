import java.util.*;

class ArrayPrint { 
    static void printArray(int[] arr) { 
        System.out.println("The original array of user:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.println();
    }
}

public class Ques9 { 
    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        
        // traverse original array in reverse direction
        for(int i = n-1; i >= 0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        
        // Input validation
        if (n <= 0) {
            System.out.println("Array size must be positive!");
            sc.close();
            return;
        }
        
        int[] arr = new int[n];
        
        System.out.println("Enter the array elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        
        // Print original array
        ArrayPrint.printArray(arr);
        
        // Reverse the array and print it
        int[] reversed = reverseArray(arr);
        System.out.println("Reversed array is:");
        ArrayPrint.printArray(reversed);
    }
}