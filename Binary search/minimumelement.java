public class minimumelement {
    static int sort(int [] arr){
        int n=arr.length,st=0,end=n-1,ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if ( arr[mid]>arr[n-1]){
                st=mid+1;
            }
            else if (arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid-1;
            }
        }
    return ans;}
    public static void main(String[] args) {
        int[] arr ={3,4,5,1,2};
     
        System.out.println(sort(arr));

    }
    
}
