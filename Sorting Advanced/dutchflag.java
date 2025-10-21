public class dutchflag {
static void swap(int[] nums,int x ,int y){
   
    int temp=nums[x];
    nums[x]=nums[y];
    nums[y]=temp;
    }



    static void sort012(int[] nums ){
        int lo=0,mid=0,high=nums.length-1;

        //explore the unkmown regin
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, mid, lo);
                lo++;
                mid++;
            }
            else if(nums[mid]==1){mid++;}

            else{
                swap(nums, mid, high);
            high--;
        }
        }
    }


    static void display(int[]nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println();
        int [] nums = { 2,1,1,2,2,0,0,1,1,2,2,0,1};
        System.out.println("Original Array : ");
        display(nums);
        sort012(nums);
        System.out.println();
        display(nums);
    }
    
}
