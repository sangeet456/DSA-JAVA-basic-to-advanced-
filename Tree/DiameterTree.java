class Solution {
    private int maxDiameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }
    
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        // Update max diameter
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
        
        // Return height of current node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}