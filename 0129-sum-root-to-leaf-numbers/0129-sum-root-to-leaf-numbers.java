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
    public int sumNumbers(TreeNode root) {
        return searcher(root, 0);
    }
    public int searcher(TreeNode noder, int current){
        if(noder == null){
            return 0;
        }
        current = (current * 10) + (noder.val);
        if(noder.left == null && noder.right == null){
            return current;
        }
        else{
            if(noder.left != null){
                searcher(noder.left, current);
            }
            if(noder.right != null){
                searcher(noder.right, current);
            }
        }
        return searcher(noder.left, current) + searcher(noder.right, current);
    }
}