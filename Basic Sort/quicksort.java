import java.util.Scanner;

public class quicksort {

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int cnt = 0;

        // Count elements smaller than pivot
        for(int i = st + 1; i <= end; i++) {
            if(arr[i] <= pivot) {
                cnt++;
            }
        }

        int pivotIdx = st + cnt;
        
        // Swap pivot to correct position
        int temp = arr[st];
        arr[st] = arr[pivotIdx];
        arr[pivotIdx] = temp;

        // Arrange elements around pivot
        int i = st, j = end;
        
        while(i < pivotIdx && j > pivotIdx) {
            while(arr[i] <= pivot) {
                i++;
            }
            while(arr[j] > pivot) {
                j--;
            }
            if(i < pivotIdx && j > pivotIdx) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void quicksortt(int[] arr, int st, int end) {
        if(st >= end) return;
        
        int pi = partition(arr, st, end);
        quicksortt(arr, st, pi - 1);
        quicksortt(arr, pi + 1, end);
    }

    static void printarray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Original array: ");
        printarray(arr);
        System.out.println("\nSorted array by quicksort:");
        quicksortt(arr, 0, n - 1);
        printarray(arr);
        sc.close();
    }
}