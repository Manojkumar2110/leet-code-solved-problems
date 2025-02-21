/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
    TreeNode root;
    public FindElements(TreeNode root) {
        this.root=root;
        root.val=0;
        dfs(root);
    }
    private void dfs(TreeNode root){
        if(root==null){
            return;
        }
        int x=root.val;
        if(root.left!=null){
            root.left.val=2 * x + 1;
        }
        if(root.right!=null){
            root.right.val=2*x+2;
        }
        dfs(root.left);
        dfs(root.right);
    }
    
    public boolean find(int target) {
        return find(root,target);
    }
    private boolean find(TreeNode root,int target){
        if(root==null){
            return false;
        }
        if(root.val==target){
            return true;
        }
        return find(root.left,target)||find(root.right,target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */