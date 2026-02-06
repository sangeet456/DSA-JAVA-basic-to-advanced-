public class TreeTraversal {
  public static class Node{
        int data;
        Node left;
        Node right;

       Node(int data){
            this.data = data;
        }
    }
//preorder traversal
static void preordertraversal(Node root){
    if(root==null) return ;
    //preorder is root left right
    System.out.print(root.data + " ");
     preordertraversal(root.left);
     preordertraversal(root.right);

}
static void inordertraversal(Node root){
    if(root==null) return ;
    //preorder is root left right
     inordertraversal(root.left);
    System.out.print(root.data + " ");
     inordertraversal(root.right);

}
static void postordertraversal (Node root){
    if(root==null) return ;
      postordertraversal(root.left);
     postordertraversal(root.right);
     System.out.print(root.data + " ");

}
   public static void main(String[] args) {
    Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        root.left =a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;
System.out.println("Preorder traversal :"); 
preordertraversal(root);
System.out.println("\n Inorder Traversal : ");
inordertraversal(root);
System.out.println("\n Post order Traversal ");
postordertraversal(root);
}
}
