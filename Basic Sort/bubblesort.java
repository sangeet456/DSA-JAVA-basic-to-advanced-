import java.util.Scanner;

public class bubblesort{

static void bubble(int[] arr){
    int n = arr.length;

    //n-1 iteration
    for(int i=0;i<n-1;i++){|||
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                //swap a and a j+1
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
        //last i element are already at correct sorted position so no need to check them
    }
}



    static void printarray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
printarray(arr);
bubble(arr);
System.out.println();
printarray(arr);
       sc.close();
    }
}
