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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        traverse(root, answer);
        return answer;
        
    }
    
    private void traverse(TreeNode root, List<Integer> lister){
        if(root == null){
            return;
        }
        lister.add(root.val);
        traverse(root.left, lister);
        traverse(root.right, lister);
    }
    
}