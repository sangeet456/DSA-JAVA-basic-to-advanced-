import java.util.Scanner;

public class radixsort{
    static int findmax(int[] arr){
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
    if(arr[i]>mx){
        mx=arr[i];
    }
    }
return mx;
}
static void basiccountsort(int [] arr,int place){ 
    int n=arr.length;
    // 2 4 2 2 
  
    //find the largest element present in the array //
int max = findmax(arr);
int [] count = new int[max+1];
for(int i=0;i<arr.length;i++){ //
    count[arr[i]]++;
}
int k=0;
for(int i=0;i<count.length;i++){
    for(int j=0;j<count[i];j++){
        arr[k]=i;
        k++;
    }
}
}
static void radix(int[]arr){
    int max = findmax(arr);//apply counting sort based on the place vallue
    for(int place=1;(max/place)>0;place*=10){
        basiccountsort(arr,place);

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
printarray(arr);
       sc.close();
    }
}