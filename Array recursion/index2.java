import java.util.Scanner;

public class index2{

    static void findallindices(int []arr,int n,int target,int idx){
        //base case 
        if (idx>=n){
            return;
        }
        //selfwork
        if(arr[idx]== target){
            System.out.println(idx);
        }
        
        //recursive wwork
        findallindices(arr, n, target, idx+1);
    }



    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        System.out.println("enter the array elements ");
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("original array");
        printarray(arr);
        System.out.println("enter the target element");
        int t=sc.nextInt();
        findallindices(arr, n, t, 0);
      
    }
    
}
