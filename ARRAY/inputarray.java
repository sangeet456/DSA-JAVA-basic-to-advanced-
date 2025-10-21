import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
    System.out.println("enter the size of the array ");
    int n = sc.nextInt();
     int [] arr= new int[n];
    System.out.println("enter the " + n + "elements of the array \t ");
    for (int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();

    }
    for (int j=0;j<arr.length;j++){
        System.out.print(arr[j]+"  ");
    }
        
    }
    
}
