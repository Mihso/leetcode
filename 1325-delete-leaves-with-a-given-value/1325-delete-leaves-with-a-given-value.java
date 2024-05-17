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
    boolean removed = false;
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        removed = true;
        while(removed){
            removed = false;
            remove(root, target);
        }
        if(root.left == null && root.right == null && root.val == target){
            return null;
        }
        return root;
    }
    
    public void remove(TreeNode root, int target){
        if(root.left != null){
            if(root.left.left == null && root.left.right == null && root.left.val == target){
                root.left = null;
                removed = true;
            }
            else{
                remove(root.left, target);
            }
        }
        if(root.right != null){
            if(root.right.left == null && root.right.right == null && root.right.val == target){
                root.right = null;
                removed = true;
            }
            else{
                remove(root.right, target);
            }
        }
    }
}