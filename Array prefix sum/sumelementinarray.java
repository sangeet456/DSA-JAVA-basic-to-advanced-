import java.util.Scanner;

public class sumelementinarray {

static void printarray(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print( arr[i] + "  ");
    }
}
static int elementsum(int[] arr){
    int n =arr.length;
   int  count=0;
    for(int i=0;i<n;i++){
         count++;
    }

return count ;
}


static int arraysumm(int[]arr){
    int n=arr.length;
    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
    }
    return sum;

}

    public static void main(String[] args) {
        System.out.println("enter the arra size :: \n");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("enter the  array elements :: ");
        int [] arr = new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        sc.close();        
        System.out.println("the array is\n ");
        printarray(arr);
        System.out.println("the sum of array is " +arraysumm(arr));
        System.out.println("the count is " + elementsum(arr));
    }
    
}
