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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newwer = new TreeNode(val);
            newwer.left = root;
            return newwer;
        }
        else{
            explore(root, val, depth - 1, true);
        }
        return root;
    }
    
    public void explore(TreeNode noder, int val, int depth, Boolean left){
        if(depth == 1){
            TreeNode newwer = new TreeNode(val);
            newwer.left = noder.left;
            noder.left = newwer;
            newwer = new TreeNode(val);
            newwer.right = noder.right;
            noder.right = newwer;
        }
        else{
            if(noder.left != null){
                explore(noder.left, val, depth - 1, true);
            }
            if(noder.right != null){
                explore(noder.right, val, depth - 1, false);
            }
        }
    }
}