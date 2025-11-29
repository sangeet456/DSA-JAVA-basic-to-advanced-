public class UnboundedKnapsack {
    static int [][] dp;

    public static int profit(int idx, int[] wt, int[] val, int C){
        if(idx==wt.length){return 0;}
        if(dp[idx][C]!=-1){return dp[idx][C];}
        int skip = profit(idx+1, wt, val, C);
        if(wt[idx]>C){return dp[idx][C]=skip;}
        int take = val[idx] + profit(idx, wt, val, C-wt[idx]);

        return dp[idx][C] = Math.max(take, skip);
    }
    public static void main(String[] args) {
        int val[]={5,3,9,16};
        int wt[] = {1,2,8,10};
        int C=8;
        int n = val.length;
        dp = new int[n][C+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<C+1;j++){
                dp[i][j] = -1;
            }
        }
     
        System.out.println(profit(0, wt, val, C));
    }

    
}
