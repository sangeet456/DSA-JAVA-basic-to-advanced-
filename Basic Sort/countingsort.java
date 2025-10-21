import java.util.Scanner;
public class countingsort {
static int findmax(int[] arr){
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
    if(arr[i]>mx){
        mx=arr[i];
    }
    }
return mx;
}


static void basiccountsort(int [] arr){ // 2 4 2 2 
  
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


    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array :");
        int n = sc.nextInt();
        System.out.println("enter the array elements :: ");
          int [] arr = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Array elements are : ");
        System.out.println();
        printarray(arr);
        System.out.println();
        System.out.println("After sorting with counting sort : ");
        System.out.println();
      basiccountsort(arr);
      printarray(arr);
      
    }
    
}
