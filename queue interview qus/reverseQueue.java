import java.util.*;
public class reversekqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);  
         q.add(31);      
        q.add(11);      
        q.add(16);      
        q.add(19);
        Stack<Integer> st = new Stack<>();
        int x= 3;
     for(int i=0;i<x;i++){
        st.push(q.poll());
     } 

        while(st.size()>0){
            q.add(st.pop());
        }
         for(int i=0;i<q.size()-x;i++){
        q.add(q.poll());
     }
    
    System.out.println(q);
    }
    
}
