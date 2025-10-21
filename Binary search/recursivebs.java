import java.util.Scanner;

public class recursivebs {
static boolean recbinarysearch(int[] arr, int st,int end, int target){
//base case
if(st>end){
return false;
}
int mid =(st+end)/2;
if(target==arr[mid]){return true;}
else if(target <arr[mid]){
    recbinarysearch(arr, st, mid-1, target);
}
else{
return recbinarysearch(arr, mid+1, end, target);
}
return false;}




static void display(int [] arr ){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements :: ");
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the array elements :");
        for(int i =0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("enter the target : ");
        int target = sc.nextInt();
       
        System.out.println("array element original :: ");
  display(arr);
System.out.println();
System.out.println(recbinarysearch(arr, 0, n-1, target));
sc.close();
    }
    
}
