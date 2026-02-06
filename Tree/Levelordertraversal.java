

public class Levelordertraversal {
     static class Node{

    int val;
    Node left;
    Node right;
     Node(int val){
        this.val=val;
    }

    
}
        public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(6);
        Node d = new Node(5);
        Node e = new Node(11);
        root.left =a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.right=e;
       
        display(root);
        
    }
    
}
