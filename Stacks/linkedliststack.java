import java.util.Stack;

public class linkedliststack {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Stack{
        Node head = null;
        int size =0;
        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head= temp;
            size++;
        }
        int pop(){
            if(head==null) {return -1;}
            int x = head.data;
             head=head.next;
             return x;
        }
        int peek(){
            if(head == null){return -1;}
            else return head.data;
        }

        void displayreverse(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp= temp.next;
            
            }
        }
        void displayrec(Node h){
            if (h==null) return ;
            displayrec(h.next);
            System.out.println(h.data);

        }
        void display(){
            displayrec(head);

        }

        
        int Size(){ //getter
            return size;
        }

    }


public static void main(String[] args) {
    


      Stack st = new Stack();
        st.push(3);
        st.push(5);
        st.push(67);
        st.display();
        System.out.println(); // 3 5 67 
        System.out.println(st.Size());
        st.pop();
        st.display();
        System.out.println();
        st.push(34);
        st.display();
    
}
}