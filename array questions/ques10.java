//bina alag se memory banate hue hi array ko kaise reverse karte hai aiye janiye hamarey sang 
//ques 9 me gand phatne ke bad assan method of reversing the array //
import java.util.*;

class arrayprint{
    static void arrs(int[] arr ){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
    }
}
 public class ques10{

    static void swapinarray(int arr[] , int i,int  j){
        int temp=arr[i];
        arr[i]=j;
        arr[j]=temp;
    }
static void reversearray(int[] arr){
    int i=0;int j=arr.length-1;
    while(i<j){
        swapinarray(arr,i,j);
        i++;
        j--;
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the number of element for array :: ");
    int n=sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter the array element ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();    }

        System.out.println("the original array is ");
        arrayprint.arrs(arr);
        reversearray(arr);
        System.out.println();
        arrayprint.arrs(arr);
      
     
     
        

}

 }