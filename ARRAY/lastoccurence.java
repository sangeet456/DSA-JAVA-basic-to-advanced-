import java.util.*;
class lasttime{
    static void occur(int[] arr, int x){
        int lastindex= -1;
        for(int k=0;k<arr.length;k++){
            if(arr[k]==x){
                lastindex = k;
            }
             }
             System.out.println("last time the element found at index : " + lastindex);

    }
}

public class lastoccurence {
 static void printarray(int[] arr ){
  for (int i=0;i<arr.length;i++){
    System.out.print( arr[i] + "  ");
  }
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the size of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //for printing the array 
        printarray(arr);
        System.out.println("enter the element to check last occurence :: ");
        int x=sc.nextInt();
   

    lasttime obj=new lasttime();
    obj.occur(arr, x);

    }
}
