class Solution {
    static boolean helper(int[][] grid, int row, int col, int num, int n) {
        if (grid[row][col] == n * n - 1) return true;
        
        int i, j;
        
        // 2 up 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == num + 1) return helper(grid, i, j, num + 1, n);
        
        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1, n);
        
        // 2 down one right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == num + 1) return helper(grid, i, j, num + 1, n);
        
        // 2 down one left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1, n);
        
        // two right one up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == num + 1) return helper(grid, i, j, num + 1, n);
        
        // two right one down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == num + 1) return helper(grid, i, j, num + 1, n);
        
        // two left one up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1, n);
        
        // two left one down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == num + 1) return helper(grid, i, j, num + 1, n);
        
        return false;
    }
    
    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) return false;
        int n = grid.length;
        return helper(grid, 0, 0, 0, n);
    }
}