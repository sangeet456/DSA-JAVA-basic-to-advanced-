import java.util.PriorityQueue;

public class priorityqueue {

    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(6);
        pq.add(7);
        System.out.println(pq);
        System.out.println(pq.peek());//topmost priority will be processed first //
    pq.poll();
    System.out.println(pq.peek());
    }
    
}
