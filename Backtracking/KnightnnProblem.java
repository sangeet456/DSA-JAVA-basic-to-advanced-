//what is the max number of knights tha can be placed in given board without getting hit by one another//
public class KnightnnProblem{
    static int maxKnights =-1;

public static void nknight(char[][] board , int row , int col ,int num){
    int n= board.length;
    if(row==n){
    for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
}
System.out.println();
return;
}

else if (issafe(board, row, col)){
    board[row][col] ='K';
    if(col!=n-1)
    nknight(board, row, col+1, num+1);
else
    nknight(board, row+1, 0, num+1);
}
else{//not safe
    if(col!=n-1) nknight(board, row, col+1, num);
    else nknight(board, row+1, col, num+1);

}
if(col !=n-1) nknight(board,row,col+1,num);
else nknight(board,row+1,0,num);
}








    public static boolean issafe(char[][] grid , int row , int col){
        int n= grid.length;
          int i, j;
        
        // 2 up 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == 'K') return false;
        
        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == 'K') return false;
        
        // 2 down one right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == 'K') return false;
        
        // 2 down one left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == 'K') return false;
        
        // two right one up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == 'K') return false;
        
        // two right one down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == 'K') return false;
        
        // two left one up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == 'K') return false;
        
        // two left one down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == 'K') return false;
        
        return true;
    }
    public static void main(String[] args) {
               int n=3;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nknight(board, 0, 0,0);
    }
    
}