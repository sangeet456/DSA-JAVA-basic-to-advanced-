import java.util.*;

public class queueprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        System.out.println("Enter the number of elements in the queue: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the queue: ");
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        // Print the queue
        Queue<Integer> helper = new LinkedList<>();
        while (q.size() > 0) {
            System.out.print(q.peek() + " ");
            helper.add(q.remove());
        }
        while (helper.size() > 0) {
            q.add(helper.remove());
        }
        System.out.println();
        System.out.print("original queue" + q + " ");

        sc.close();
    }
}