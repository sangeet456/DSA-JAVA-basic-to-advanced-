import java.util.Scanner ;


class arrayprint{
    static void printarray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
public class prefixsum2{
    static int[] makeprefixsum(int[] arr){
           
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
       return arr;
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array size");
    int n = sc.nextInt();
    System.out.println("enter the elements of the array");
    int [] arr = new int [n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();     
    }
    sc.close();

    System.out.println("the array formed by you is \n");
    arrayprint.printarray(arr);  
    System.out.println("prefix Sum lauda lassan :: \n");
 
 int [] prefix=makeprefixsum(arr);
      arrayprint.printarray(prefix);
        
}
}