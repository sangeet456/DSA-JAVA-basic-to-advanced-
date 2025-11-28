import java.util.ArrayList;
import java.util.*;

public class Nqueens {

private static void nqueen(char[][]board,int row){
    int n = board.length;
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

for(int j=0;j<n;j++){
    
        if(isSafe(board,row,j)){
            board[row][j]='Q';
            nqueen(board,row);
            board[row][j]='.';//backtracking
        }
    }

}
private static boolean isSafe( char[][] board, int row, int col){
    int n=board.length;
    //check row//
    for(int j=0;j<n;j++){
        if(board[row][j]=='Q'){return false;}
    }
    for(int i=0;i<n;i++){
        if(board[i][col]=='Q'){return false;}
    }


    int i=row;
    int j=col;
// north east
i=row; j=col;  // RESET
while(i>=0 && j<n){
    if(board[i][j]=='Q') return false;
    i--; j++;
}

// south east  
i=row; j=col;  // RESET
while(i<n && j<n){
    if(board[i][j]=='Q') return false;
    i++; j++;
}

// south west
i=row; j=col;  // RESET  
while(i<n && j>=0){
    if(board[i][j]=='Q') return false;
    i++; j--;
}

// north west
i=row; j=col;  // RESET
while(i>=0 && j>=0){
    if(board[i][j]=='Q') return false;
    i--; j--;
}
return true;
}


    public static void main(String[] args) {
        int n=4;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';


            }
        }
       List<List<String>> s = new ArrayList<>();
            nqueen(board,0);
    }
    
}
