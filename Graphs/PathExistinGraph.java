import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathExistinGraph {


    class Solution {
    private void bfs(int start, int end, List<List<Integer>> adj, boolean vis[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;
        
        while (!q.isEmpty()) {
            int front = q.remove();
            // Early exit if we found the destination
            if (front == end) return;
            
            for (int neighbor : adj.get(front)) {
                if (!vis[neighbor]) {
                    q.add(neighbor);
                    vis[neighbor] = true;
                }
            }
        }
    }
    
    public boolean validPath(int n, int[][] edges, int start, int end) {
        if (start == end) return true;
        
        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Add edges (undirected graph)
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] vis = new boolean[n];
        bfs(start, end, adj, vis);
        return vis[end];
    }
}
}
