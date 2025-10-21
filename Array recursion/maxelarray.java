import java.util.Scanner;
public class maxelarray{
static void printarray(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + "  ");
    }
}
static int sumarray(int[] arr , int idx){
    if(idx==arr.length){
        return 0;
    }
    //recursive work
    int smallans=sumarray(arr, idx+1);
    //selfwork
    int realans=smallans+arr[idx];
return realans;
}
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements :: ");       
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt(); }
        sc.close();
        System.out.println("array final bro ::: ");
        printarray(arr);
        System.out.println("sum of array element");
        System.out.println();
        System.out.println(sumarray(arr,0));
}}