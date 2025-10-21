import java.util.*;
import java.util.Scanner;

public class subsetsum {


static void printarray(int[]arr){
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
    }
}



    static void sumsubset(int[]arr,int n,int idx,int currsum){

//base case
if(idx>=n){
    System.out.println(currsum);
return ;
}


        //curerent index + curr ans
        sumsubset(arr ,n,idx+1,currsum+arr[idx]);
        //current ans
        sumsubset(arr, n, idx+1, currsum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size : ");
        int x=sc.nextInt();
        int[] arr=new int[x];
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
        printarray(arr);
        System.out.println("the subset sum are ");


        sumsubset(arr, arr.length, 0, 0);

        

        
    }
    
}
