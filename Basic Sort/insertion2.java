import java.util.Scanner;

public class insertion2{

 static void insert(int[] arr){
    int n =arr.length;
    for(int i=1;i<arr.length;i++){
        for(int j=i  ; j>0 ;j--){
            if(arr[j]<arr[j-1]){
            int temp =arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
        }
    }
}
 }

    static void printarray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
printarray(arr);
System.out.println();
System.out.println("sorted array by insertion sort");
System.out.println();
insert(arr);
printarray(arr);
       sc.close();;
    }
}