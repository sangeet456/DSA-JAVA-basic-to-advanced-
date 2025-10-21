import java.util.Scanner;

class Questions{
    static void countoccurence(int[] arr , int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if( arr[i]==x){
                count ++;
            }
        }
        System.out.println("the count for the element "+x+ "is" +count);
    }
    
}
public class occurence {

    static void printarray(int[] arr){
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
     }
       }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the array size :: ");
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements in the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the x");
        int x=sc.nextInt();
        //for printing the count of the array element
        Questions obj1= new Questions();
        obj1.countoccurence(arr, x);
        
        

    }
    
}
