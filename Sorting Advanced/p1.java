public class p1{

    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void sortarray(int[] arr){
        int n = arr.length;
        int x=-1,y=-1;
        if(n<=1){return ;}
        //process all adjacent element 
        for(int i=1;i<n;i++){
            if (arr[i-1]>arr[i]){
            if(x==-1){    
             x= i-1;
               y = i;
            }
            else{
                y=i;
            }
            }
        }
        //swapping
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;



}
    public static void main(String[] args) {
     int[] arr ={10,5,6,7,8,9,3};
     sortarray(arr);
printarray(arr);
      
    }
}