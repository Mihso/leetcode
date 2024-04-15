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
        String sr = "";
        searcher(root, sr);
        return answer;
    }
    public void searcher(TreeNode noder, String current){
        String copy = current + noder.val;
        if(noder.left == null && noder.right == null){
            answer += Integer.valueOf(copy);
        }
        else{
            if(noder.left != null){
                searcher(noder.left, copy);
            }
            if(noder.right != null){
                searcher(noder.right, copy);
            }
        }
    }
}