import java.util.Scanner;

public class printarray{

    static void print(int[] arr , int idx){
        //base case
        if(idx == arr.length){
return;
        }

        //self work 
        System.out.println(arr[idx]);
        //recursive
        print(arr, idx+1);

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
System.out.println("array elements");
print(arr, 0);

    }
}