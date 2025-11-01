public class rev2{
    public static class Node{
        int data;
        Node next;
    Node(int data){
        this.data=data;
    }

    }
    //without recursion reverse
    public static Node rev(Node head){
        Node curr=head;
        Node prev=null;
        Node agla = null;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
}
static void display(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
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
        a=rev(a);
        display(a);
        
      
        

    }
    
}