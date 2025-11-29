class Solution {
    static int[][]dp;
    public static int paths(int row,int col ,int m , int n){
        if(row>=m||col>=n){return 0;}
        if(row==m-1||col==n-1) return 1;
        if(dp[row][col]!=-1) return dp[row][col];

        int rightways= paths(row,col+1,m,n);
        int downways = paths(row+1,col,m,n);
        return dp[row][col]=rightways+downways;
    }
   public static void main(String[] args) {
    
   int m =4;
   int n = 4; 
         dp = new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            dp[i][j] = -1 ;
        }
       }System.out.println(paths(0, 0, 4, 4));
 
        
    }

    }
