import java.util.*;

class arrayprint{
    static void arrs(int[] arr ){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
    }
}
 public class ques1{
static void pairsum(int[] arr ,int target){
    int n = arr.length;
    int ans=0;
    for(int i=0;i<n;i++){
        //first number
        for(int j=i+1;j<n;j++){

            if (arr[i]+arr[j]==target){
                ans++;
            }
        }
    }
System.out.println("pairs are : " + ans);
}
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the number of element for array :: ");
    int n=sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter the array element ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();    }

        System.out.println("the array is ");
        arrayprint obj1= new arrayprint();
        obj1.arrs(arr);
        System.out.println("number jiske barabar sum ana chaiye kitne pair h dalo : : ");
        int target = sc.nextInt();
        
    pairsum(arr, target);
}

 }