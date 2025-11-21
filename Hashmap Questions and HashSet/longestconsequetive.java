import java.util.HashSet;

public class longestconsequetive {

    public int longestconsequetivesubsequence(int [] nums){

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        
        }
int maxstreak=0;
    for(int num : hs){
        if(hs.contains(num-1)){ //nm is starting point of the sequence}
            int currnum= num;
            int currstreak=1;
            while (hs.contains(currnum+1)) {
                currstreak++;
                currnum++;
            }
            maxstreak= Math.max(maxstreak,currstreak);
    }
}
return maxstreak;
}
    public static void main(String[] args) {
        
    }
    
}
