public class LinkedListimplement {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class queueL {
        Node head = null;
        Node tail = null;
        int size = 0;

        // Remove 'static' keyword - it should be instance method
        void add(int x) {
            Node temp = new Node(x);
            
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next=temp;
                tail = temp;

            }
            size++;
        }

        public int peek(){
         return head.data;
        }

        void remove(){
               if(size==0){ System.out.println("queue is empty");}
         
            head = head.next;
            
        }

        // Optional: Add display method for queue
        public void display() {
            if(size==0){
                System.out.println("Queue is Empty !! ");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        queueL queue = new queueL();

        System.out.println("QUEUE IS : ");
        queue.add(89);
         queue.add(8);
        queue.add(12);
        queue.add(39);
        queue.display();
        System.out.println();
        System.out.println(queue.peek());
        queue.remove();
        queue.display();
        System.out.println();
       System.out.println(queue.peek());

    }
}