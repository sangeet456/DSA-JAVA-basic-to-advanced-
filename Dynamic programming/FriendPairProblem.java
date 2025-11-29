import java.util.Scanner;
import java.util.Arrays;
public class FriendPairProblem {

 public static int pair(int n,int dp[]){
    if(n<=2) return n;
    if(dp[n]!=-1){return dp[n];}
return dp[n]= pair(n-1,dp) + (n-1)*pair(n-2,dp);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pair(n,dp));
    
    sc.close();
}
    
}
