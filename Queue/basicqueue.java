import java.util.*;

public class basicqueue {
    public static void main(String[] args) {

        // ArrayList<Integer> al = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.size());

    }

}
