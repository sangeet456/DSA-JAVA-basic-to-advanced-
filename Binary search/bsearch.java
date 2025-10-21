import java.util.Scanner;

public class bsearch{
static boolean binary(int[]arr, int target){

int st=0, end=arr.length-1;

while(st<=end){
    int mid=(st+end)/2;
if(target == arr[mid]){
    return true;
}
else if(target<arr[mid]){
    end=mid-1;
}
else{
    st=mid+1;
}
}
return false;

}


static void display(int [] arr ){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}

    public static void main(String[] args){
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
System.out.println(binary(arr, target));
sc.close();

    }
}