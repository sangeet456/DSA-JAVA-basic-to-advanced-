public class reverselist {
    public static class Node{
        int data;
        Node next;
    Node(int data){
        this.data=data;
    }

    }
    public static Node reverse(Node head){
        //base case
        if(head.next==null) return head;
        //rec work
        Node newHead=reverse(head.next);

        //self work
        head.next.next = head;
        head.next = null;  
    return newHead;}
    static void display(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");  // CHANGED println to print
          display(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d= new Node(56);
     
        a.next=b;
        b.next=c;
  c.next=d;
        System.out.println("the list is : ");
        display(a);
        System.out.println(); 
        a = reverse(a);
        display(a);

    }
    
}