import java.util.*;
public class NextgreaterElement {

public static void display(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

}
static int[] Nextgreater(int[] arr){
    int res[] = new int[arr.length];
    int n = arr.length;
    for(int i=0;i<n;i++){
        res[i]= -1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]>arr[i]){
                res[i]=arr[j];
                break;
            }
        }
    }
return res; }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size");
        int x= sc.nextInt();
        int[] arr = new int[x];
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The ARRAY is : ");
        display(arr);
        System.out.println();
        int [] result = new int[arr.length];
        result= Nextgreater(arr);
        display(result);
       

    }
    
}
