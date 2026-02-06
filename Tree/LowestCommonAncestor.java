class Solution {
    public boolean exists(TreeNode root , TreeNode node){
        if(node == root) return true;
        if(root==null) return false;
        return exists(root.left,node) || exists(root.right,node);
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        
        //does 'p' lie in LST
        boolean pliesinlst = exists(root.left,p);
        boolean qliesinlst = exists(root.left,q);
        
        // Case 1: Both in left subtree
        if(pliesinlst == true && qliesinlst == true) 
            return lowestCommonAncestor(root.left, p, q);  // fixed case
        
        // Case 2: Both in right subtree  
        if(pliesinlst == false && qliesinlst == false) 
            return lowestCommonAncestor(root.right, p, q);  // fixed case and parameters
        
        // Case 3: One in left, one in right
        else
            return root;
    }
}