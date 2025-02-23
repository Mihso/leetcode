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
    int pre = 0;
    int post = 0; 
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode answer = new TreeNode(preorder[pre++]);
        if(answer.val != postorder[post]){
            answer.left = constructFromPrePost(preorder, postorder);
        }
        if(answer.val != postorder[post]){
            answer.right = constructFromPrePost(preorder, postorder);
        }
        post++;
        return answer;
    }
}