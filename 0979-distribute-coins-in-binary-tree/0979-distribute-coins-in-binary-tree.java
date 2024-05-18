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
    int counter = 0;
    public int distributeCoins(TreeNode root) {
        navigate(root);
        return counter;
    }
    
    public int navigate(TreeNode root){
       if(root == null){
           return 0;
       }
        
        int leftCoins = navigate(root.left);
        int rightCoins = navigate(root.right);
        
        counter += Math.abs(leftCoins) + Math.abs(rightCoins);
        
        return root.val - 1 + leftCoins + rightCoins;
    
    }
}