import java.util.*;
class printarray{
    static void arrayprint(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class ques3{
    static void findunique(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]= -1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            if (arr[i]>0){
                ans = arr[i];
            }
        }
           System.out.println("ansof the unique element  is \t " + ans );
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in the array : ");
        int n= sc.nextInt();
        System.out.println("enter the array elements");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is ");
             printarray.arrayprint(arr);
             System.out.println();
             findunique(arr);

    }
}