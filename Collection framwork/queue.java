import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(34);
        q.add(78);
        q.add(72);
        q.add(12);
        q.add(34);
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        q.poll();
        System.out.println(q.poll());
        System.out.println(q.isEmpty());
        
    }
    
}
