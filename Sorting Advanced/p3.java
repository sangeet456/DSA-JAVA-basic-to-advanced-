//sprt the array which has only 1s 2s and 0s in it

public class p3 {
static void sort (int [] nums){
int count0=0, count1=0, count2=0;
int n =nums.length;
for(int i=0;i<n;i++){
    if(nums[i]==0){count0++;}
    else if(nums[i]==1){count1++;}
    else{count2++;}
}
int idx=0;
for(int i=0;i<count0;i++){
    nums[idx++]=0;
}
for(int i=0;i<count1;i++){
   nums[idx++]=1;  
}
for(int i=0;i<count2;i++){
    nums[idx++]=2;
}
}


static void display(int[]nums){
    for(int i=0; i<nums.length;i++){
        System.out.print(nums[i]+" ");
    }
}

    
    public static void main(String[] args) {
        int[] nums= {0,2,1,2,0,0};
        display(nums);
        sort(nums);
        System.out.println();
        display(nums);

    }
    
}
