import java.util.Scanner;

public class searchx {

    static boolean findelement(int[] arr ,int x){
        for(int i=0;i<arr.length;i++){
                    if(arr[i]==x){
                        
        return true;}
       
    }
   return false;}

    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        System.out.println("enter the array elements ");
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("original array");
        printarray(arr);
        System.out.println("enter the element top search iterative :: ");
            int x=sc.nextInt();
          System.out.println ( findelement(arr, x));

    }
    
}
