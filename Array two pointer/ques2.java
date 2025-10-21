import java.util.*;
class printarray{
    static void arrayprint(int[] arr){
        //for printing the array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
public class ques2{
    static void swap( int[] arr , int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;

    }
    static void sortzeroandne(int[] arr){

         int n=arr.length ; 
         int left =0 ; 
         int right = n-1;
         while (left<right){
         if( arr[left]==1 && arr[right]==0){
            swap(arr, left , right);
          left ++;
        right--;
    }
        if(arr[left] == 0){
            left++;
        }
    if(arr[right]==1){
        right --;
    }
}
            
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size");
    int n= sc.nextInt();
    System.out.println("enter the array elements to sort :: ");
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }

  sc.close();
 System.out.println("original array");
 printarray.arrayprint(arr);
 System.out.println("\n sorted array");
 sortzeroandne(arr);
 printarray.arrayprint(arr);
}

    
}