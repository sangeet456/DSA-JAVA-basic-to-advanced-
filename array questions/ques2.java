import java.util.*;

class arrayprint{
    static void arrs(int[] arr ){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  \n");
        }
    }
}
 public class ques2{
static void tripletsum(int[] arr ,int target){
    int n = arr.length;
    int ans=0;
    for(int i=0;i<n;i++){
        //first number fix it 
        // second loop to fix second elements
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n-1;k++)//thord number 

            if (arr[i]+arr[j]+arr[k]==target){
                ans++;
            }
        }
    }
System.out.println("Triplets are : " + ans);
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
        System.out.println("number jiske barabar sum ana chaiye kitne triplet  dalo  : :\n ");
        int target = sc.nextInt();
        
    tripletsum(arr, target);
}

 }