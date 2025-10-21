import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class bucketsort {

    static void bucket(float[] arr) {
        int n = arr.length;
        // Create buckets 
        ArrayList<Float>[] buckets = new ArrayList[n];
        
        // Create empty buckets
        for(int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }
        
        // Add elements into the buckets 
        for(int i = 0; i < n; i++) {
            int bucketIndex = (int)(arr[i] * n);
            // Fix: Handle edge case where arr[i] = 1.0
            if(bucketIndex >= n) {
                bucketIndex = n - 1;
            }
            buckets[bucketIndex].add(arr[i]);
        }
        
        //sort each bucket index individually//
        for(int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        //merge all to get final sorted array
        int index = 0;
        for(int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for(int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }
    }

    static void printarray(float[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        
        float[] arr = new float[n];
        
        System.out.println("enter the array elements (between 0 and 1)");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }

        System.out.println("original array :: ");
        printarray(arr);
        System.out.println("\nsorted array by bucket sort");
        bucket(arr);
        printarray(arr);
        sc.close();
    }
}