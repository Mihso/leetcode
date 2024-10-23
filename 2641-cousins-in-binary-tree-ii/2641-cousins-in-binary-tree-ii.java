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
    public TreeNode replaceValueInTree(TreeNode root) {
        List<TreeNode> start = new ArrayList<>();
        root.val = 0;
        start.add(root);
        traverse(start);
        return root;
    }
    
    private void traverse(List<TreeNode> trees){
        List<TreeNode> values = new ArrayList<>();
        int all = 0;
        for(TreeNode t: trees){
            if(t.left != null){
                all += t.left.val;
            }
            if(t.right != null){
                all += t.right.val;
            }
        }
        for(TreeNode t: trees){
            int summer = 0;
            if(t.left != null){
                summer += t.left.val;
            }
            if(t.right != null){
                summer += t.right.val;
            }
            if(t.left != null){
                t.left.val = all - summer;
            }
            if(t.right != null){
                t.right.val = all - summer;
            }
            if(t.left != null){
                values.add(t.left);
            }
            if(t.right != null){
                values.add(t.right);
            }
            
        }
        if(values.size() > 0){
            traverse(values);
        }
        
        
        
    }
}