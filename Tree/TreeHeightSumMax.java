public class TreeHeightSumMax {
  
    static class Node{

    int val;
    Node left;
    Node right;
     Node(int val){
        this.val=val;
    }

    
}
//preorder
public static void preorder(Node root){
    if(root==null) return;
    System.out.print(root.val + " ");
    preorder(root.left);
    preorder(root.right);
}
//size
public static int size(Node root){
    if(root==null) return Integer.MIN_VALUE;
    return 1+ size(root.left) + size(root.right);
}
//sum
public static int  sum(Node root){

    if(root==null) return 0;
    return root.val+sum(root.left)+sum(root.right);
}
// max 
public static int  max(Node root){
    if(root==null) return 0;
    int a = root.val;
    int b =max(root.left);
    int c = max(root.right);
    return Math.max(a,Math.max(b,c));
}
//height
public static int height(Node root) {
    if (root == null) return 0;
    if(root.left==null && root.right==null) return 0;
    return 1+ Math.max(height(root.left), height(root.right));
}
public static void main(String[] args) {
    Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        root.left =a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.right=e;
        preorder(root);
        System.out.println();
        System.out.println("length :");
System.out.println(size(root));
System.out.println("sum :");
System.out.println(sum(root));
System.out.println("\nmaximum value : ");
System.out.println(max(root));
System.out.println("Height of the Tree");
System.out.println(height(root));
    }
}
