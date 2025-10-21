class maximum{
    void maxelementarray(){
        int arr[]={5,3,6,2,8,1};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] > ans){
                ans = arr[i];
            }}
            System.out.println(ans);

       
    }
}

public class maxelarray {
    public static void main(String[] args) {
        System.out.println("max element in the array is :");
        maximum obj= new maximum();
        obj.maxelementarray();
    }
    
}
