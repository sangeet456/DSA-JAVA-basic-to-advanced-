public class p2 {

static void partition(int [] nums){
int l=0, r=nums.length-1;
while(l<r){
    while(nums[l]<0){l++;}
    while(nums[r]>=0){r--;}
if(l<r){
    int temp=nums[l];
    nums[l]=nums[r];
    nums[r]=temp;
    l++;
    r--;
}

}


}


    static void sortarray(int [] nums, int l, int r){
        int pivot = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){

            }
        }

    }





    static void display (int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int[] nums= {19,-20,7,-4,-13,11,-5,3};
    partition(nums);
        display(nums);

    }
}
