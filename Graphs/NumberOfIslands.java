public class NumberOfIslands {
    class Solution {
    class Pair {
        int row;
        int col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    private void bfs(int row, int col, char[][] grid, boolean[][] visited) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));
        visited[row][col] = true;
        
        // Directions: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!q.isEmpty()) {
            Pair front = q.remove();
            int currentRow = front.row;
            int currentCol = front.col;
            
            // Check all four directions
            for (int[] dir : directions) {
                int newRow = currentRow + dir[0];
                int newCol = currentCol + dir[1];
                
                // Check if new position is within bounds and is land and not visited
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols 
                    && grid[newRow][newCol] == '1' && !visited[newRow][newCol]) {
                    q.add(new Pair(newRow, newCol));
                    visited[newRow][newCol] = true;
                }
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }
}
    
}
