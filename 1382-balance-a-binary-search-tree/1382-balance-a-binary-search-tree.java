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
    public TreeNode balanceBST(TreeNode root) {
       List<Integer>order = new ArrayList<>();
        
        traverse(root, order);
        
        return bal(order, 0, order.size() - 1);
        
    }
    
    private void traverse(TreeNode root, List<Integer> order){
        if(root.left != null){
            traverse(root.left, order);
        }
        order.add(root.val);
        if(root.right != null){
            traverse(root.right, order);
        }
        
    }
    
    private TreeNode bal(List<Integer> order, int start, int end){
        if(start <= end){
            int middle = (end+start) / 2;
        
            TreeNode answer = new TreeNode(order.get(middle));
            
            answer.left = bal(order, start, middle - 1);
            answer.right = bal(order, middle + 1, end);
            return answer;
        }
        else{
            return null; 
        }
    }
}