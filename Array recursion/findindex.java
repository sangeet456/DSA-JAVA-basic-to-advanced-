import java.util.Scanner;

public class findindex {
//return uindex of array if target present in the array other wise return -1
 static int findindex(int[] arr, int n,int target,int idx){
        //base case
        if(idx >= n){
            return -1;
        }

        //self woprk
        if(arr[idx]==target){
            return idx;
        }
        //recursive work
      return findindex(arr, n, target, idx+1);



    }


    static boolean findelement(int[] arr, int n,int target,int idx){
        //base case
        if(idx >= n){
            return false;
        }

        //self woprk
        if(arr[idx]==target){
            return true;
        }
        //recursive work
        if(findelement(arr, n, target, idx+1)){
            return true;
        }
        else{
            return false;
        }



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
        System.out.println();
        System.out.println("enter the target element to searchj");
        int target = sc.nextInt();
System.out.println();
    
  System.out.println(findindex(arr, n, target, 0));
    }
}
