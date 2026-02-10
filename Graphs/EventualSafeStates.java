import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EventualSafeStates {
    class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        //reverse the graph
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        int [] indegree = new int[n];
        for(int i=0;i<n;i++){
            for(int ele : graph[i]){
                //in orginianl graph edge is from i to ele
                //reverse graph mein element to i 
                adj.get(ele).add(i);
                indegree[i] ++;
            }

        }
        //apply kanhs algorithm
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
        if(indegree[i]==0) q.add(i);
    }
    while(q.size()>0){
        int front = q.remove ();
        ans.add(front);
        for(int ele : adj.get(front)){
            indegree[ele] --;
            if(indegree[ele]==0) q.add(ele);
        }
    }
    Collections.sort(ans);
    return ans;
    }
}
    
}
