public class LLimplement {

    public static class Node {
        Node next;
        int data;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        // insert at end 
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            
            if (head == null) { // If list is empty
                head = temp;
                tail = temp;
            } else { // If list has elements
                tail.next = temp;
                tail = temp;
            }
        }
        //display function 
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
//insert at head
        void insertAthead(int data){
        Node temp = new Node(data);
           
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head = temp;
            }

        }
        //insert at idx 
        void insertatidx(int data , int idx ){
            Node temp = head;
            Node free = new Node(data);
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
           free.next = temp.next;
           temp.next = free;

        }
        void deleteAtidx(int idx){
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next=temp.next.next;

        }


        int count() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        // Insert elements
        ll.insertAtEnd(90);
        ll.insertAtEnd(78);
        ll.insertAtEnd(90);
        ll.insertAtEnd(87);
        ll.insertAthead(500);
        ll.insertatidx(344, 2);
        ll.deleteAtidx(5);

        System.out.println("The Linked List is:");
        ll.display();
        

      
        System.out.println("Number of nodes: " + ll.count());
    }
}