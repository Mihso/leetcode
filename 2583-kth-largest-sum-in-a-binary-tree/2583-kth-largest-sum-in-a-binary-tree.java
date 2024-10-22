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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> levels = new LinkedList<>();
        levels.add(root);
        List<Long> values = new ArrayList<>();
        while(!levels.isEmpty()){
            long summer = 0;
            int lengther = levels.size();
            for(int i = 0; i < lengther; i++){
                TreeNode tree = levels.remove();
                summer += tree.val;
                if(tree.left != null){
                    levels.add(tree.left);
                }
                if(tree.right != null){
                    levels.add(tree.right);
                }
            }
            values.add(summer);
        }
        Collections.sort(values, Collections.reverseOrder());
        if(values.size() < k){
            return -1;
        }
        return values.get(k - 1);
    }
}