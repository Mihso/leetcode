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
    public TreeNode reverseOddLevels(TreeNode root) {
        List<TreeNode> start = new ArrayList<>();
        start.add(root);
        reverser(start, false);
        return root;
    }
    
    private void reverser(List<TreeNode> row, boolean odd){
        if(odd){
            int left = 0;
            int right = row.size() -1;
            
            while(left < right){
                int store = row.get(left).val;
                row.get(left).val = row.get(right).val;
                row.get(right).val = store;
                left++;
                right--;
            }
        }
        
        List<TreeNode> next = new ArrayList<>();
        for(TreeNode branch: row){
            if(branch.left != null){
                next.add(branch.left);
            }
            if(branch.right != null){
                next.add(branch.right);
            }
        }
        if(next.size() > 0){
            reverser(next, !odd);
        }
        
    };
}