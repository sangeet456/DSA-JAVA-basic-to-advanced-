import java.util.*;
class printarray{
    static void arrayprint(int[] arr){
        //for printing the array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

public class ques1{
    static void sortzeroandne(int[] arr){
        int n = arr.length;
      int zeroes=0;
       //0 se 0 minus 1 tak hame zero dalna hai aur baki bache me 1 zero se n-1
        //count number of zeroes
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0){
                zeroes++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
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