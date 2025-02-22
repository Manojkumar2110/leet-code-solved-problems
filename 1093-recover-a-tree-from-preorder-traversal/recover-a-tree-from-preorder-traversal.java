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
class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        return recover(traversal,0);
    }
    private int i=0;
    private TreeNode recover(String trav,int d){
        int nd=0;
        while(i+nd<trav.length()&&trav.charAt(i+nd)=='-')
            ++nd;
        if(nd!=d){
            return null;
        }
        i+=d;
        int st=i;
        while(i<trav.length()&&Character.isDigit(trav.charAt(i)))
            ++i;
        return new TreeNode(Integer.valueOf(trav.substring(st,i)),recover(trav,d+1),recover(trav,d+1));
    }
}