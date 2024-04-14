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
    int answer = 0; 
    public int sumOfLeftLeaves(TreeNode root) {
        travel(root, false);
        return answer;
    }
    
    public void travel(TreeNode noder, Boolean lefter){
        if(noder.left == null && noder.right == null && lefter){
            answer += noder.val;
        }
        else{
            if(noder.left != null){
                travel(noder.left, true);
            }
            if(noder.right != null){
                travel(noder.right, false);
            }
        }
    }
}