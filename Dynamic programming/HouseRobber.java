import java.util.*;
public class HouseRobber {

    public int amount(int [] arr , int idx,int[]dp){
        if(idx>=arr.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int take = arr[idx] + amount(arr,idx+2,dp);
        int skip = amount(arr,idx+1,dp);
        return dp[idx]=Math.max(take,skip);
    }
    public static void main(String[] args) {
        
        int arr[] ={5,15,6,20,22};
        int dp[] = new int[arr.length];
        Arrays.fill(dp,-1);
        HouseRobber hc = new HouseRobber();
        System.out.println(hc.amount(arr, 0,dp));
    }
    
}
