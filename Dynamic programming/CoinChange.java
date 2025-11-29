public class CoinChange {
       class Solution {
    static long dp[][] ;
public long  countcoin(int idx,int[]coin,int amount){
    if(idx==coin.length){
        if(amount ==0) return 0;
    
    else return Integer.MAX_VALUE;
}
if(dp[idx][amount] != -1) return dp[idx][amount];
long skip = countcoin(idx+1,coin,amount);
if(amount - coin[idx] < 0) return skip;

long pick = 1+ countcoin(idx,coin,amount-coin[idx]);
return dp[idx][amount]= Math.min(skip,pick);
}


    public int coinChange(int[] coin, int amount) {
        dp = new long[coin.length][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        long ans = countcoin(0,coin,amount);
        if(ans==Integer.MAX_VALUE) return -1;
        return (int)ans;
        
    }
    }

    
}
