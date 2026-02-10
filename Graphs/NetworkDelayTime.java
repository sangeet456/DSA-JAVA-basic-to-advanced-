import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {
    class Solution {
    // Pair class
    class Pair implements Comparable<Pair> {
        int node;
        int time;
        
        Pair(int node, int time) {
            this.node = node;
            this.time = time;
        }
        
        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.time, other.time);
        }
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>()); // n+1 for 1-based indexing
        for(int i=0;i<times.length;i++){
            int u = times[i][0] , v= times[i][1],time = times[i][2]; // times[i][2] not times[i][0]
            adj.get(u).add(new Pair(v,time));
        }
        int ans[] =new int[n+1];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[k]=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        pq.add(new Pair(k,0));
        while(pq.size()>0){
            Pair top = pq.remove();
            int node = top.node , time=top.time;
            if(top.time>ans[node]) continue;
            for(Pair p : adj.get(node)){
                int totaltime=top.time+p.time;
                if(totaltime<ans[p.node]){
                    ans[p.node]=totaltime;
                    pq.add(new Pair(p.node,totaltime));
                }
            }
        }
        int max =-1;
        for(int i=1;i<=n;i++){
            if(ans[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(max,ans[i]);
        }
        return max;
    }
}
    
}
