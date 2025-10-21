public class firstoccurence {
    static int firstocc(int[] arr ,int x){
        int n = arr.length;
        int st=0;
        int end=n-1;
          int fo=-1;
        while(st<=end){
          
            int mid=(st+end)/2;
            if(arr[mid]==x){
                fo=mid;
              end=mid-1;
            } 
    
            else if(x<arr[mid]){
                end = mid-1;
            }
            else{
                st=mid+1;
            }
        }
    return fo;
 }
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,3,5};
        int x=5;
        System.out.println(firstocc(arr, x));

    }
    
}
