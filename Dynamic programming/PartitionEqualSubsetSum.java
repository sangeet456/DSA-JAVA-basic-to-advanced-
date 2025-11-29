class Solution {
    static int[][] dp;
    
    static boolean subset(int i, int sum, int arr[], int target) {
        if(sum == target) return true;
        if(i == arr.length || sum > target) return false;
        
        if(dp[i][sum] != -1) return dp[i][sum] == 1;
        
        boolean pick = subset(i + 1, sum + arr[i], arr, target);
        boolean skip = subset(i + 1, sum, arr, target);
        
        boolean result = pick || skip;
        dp[i][sum] = result ? 1 : 0;
        return result;
    }
    
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        if(sum % 2 != 0) return false;
        
        int target = sum / 2;
        dp = new int[nums.length][target + 1];
        
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j <= target; j++) {
                dp[i][j] = -1;
            }
        }
        return subset(0, 0, nums, target);
    }
}