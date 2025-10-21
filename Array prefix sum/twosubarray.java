import java.util.Scanner;

class arrayprint {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class twosubarray {
    static int findArraysum(int[] arr) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum = totalsum + arr[i];
        }
        return totalsum;
    }

    static boolean equalsumPartition(int[] arr) {
        int totalsum = findArraysum(arr);
        int prefixsum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            prefixsum = prefixsum + arr[i];
            int suffixsum = totalsum - prefixsum;
            
            if (suffixsum == prefixsum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("The array formed by you is:");
        arrayprint.printarray(arr);
        System.out.println();
        System.out.println("Equal sum partition: " + equalsumPartition(arr));
    }
}