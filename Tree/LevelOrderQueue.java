import java.util.*;
public class LevelOrderQueue {
  
   static class Node{

    int val;
    Node left;
    Node right;
     Node(int val){
        this.val=val;
    }

}
    static void levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null)q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+ " ");
           if(front.left!=null) q.add(front.left);
           if(front.right !=null) q.add(front.right);
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
       
       System.out.println("Level Order");
       System.out.println();
       levelorder(root);
        
    }
}
