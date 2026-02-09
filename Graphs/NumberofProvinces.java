import java.util.LinkedList;
import java.util.Queue;

public class NumberofProvinces {
    class Solution {
    private void bfs(int i, boolean[] vis, int[][] adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = true;
        
        while (!q.isEmpty()) {
            int front = q.remove();
            
            for (int j = 0; j < adj.length; j++) {
                if (adj[front][j] == 1 && !vis[j]) {
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }

    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                bfs(i, vis, adj);
                count++;
            }
        }
        return count;
    }
}
    
}
