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
        if(root != null){
            traverse(root, answer);
        }
        return answer;
        
    }
    
    private void traverse(TreeNode root, List<Integer> lister){
        
        lister.add(root.val);
        
        if(root.left != null){
            traverse(root.left, lister);
        }
        if(root.right != null){
            traverse(root.right, lister);
        }
        
    }
    
}