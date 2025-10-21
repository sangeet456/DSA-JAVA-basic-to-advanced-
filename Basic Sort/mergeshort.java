import java.util.Scanner;

public class mergeshort{

static void merge(int [] arr, int l, int mid, int r){
    int n1 = mid-l+1;
    int n2= r-mid;
    int[] left = new int[n1];
    int [] right= new int[n2];

    int i,j,k;
    for(i=0;i<n1;i++){
        left[i]=arr[l+i];
    }
    for(j=0;j<n2;j++){
        right[j]=arr[mid+1+j];
    }
    i=0;
    j=0;
    k=l;
    while(i<n1&&j<n2){
        if(left[i]<right[j]){
            arr[k++]=left[i++];
        }
        else{
            arr[k++]=right[j++];

        }
    }
    while(i<n1){
        arr[k]=left[i];
        k++;
        i++;

    }
    while(j<n2){
        arr[k++]=right[j++];
    }

}



static void mergesortt(int[] arr,int l,int r){
    if(l>=r){return;}

    int mid = (l+r)/2;
    mergesortt(arr, l, mid);
    mergesortt(arr, mid+1, r);

    merge(arr,l,mid,r);

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
System.out.println();
mergesortt(arr, 0, n-1);
System.out.println();
System.out.println("sorted after merge sort :: ");
printarray(arr);
       sc.close();
    }
}