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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> nodes = new HashMap<>();
        
        List<Integer> heads = new ArrayList<>();
        for(int[] d : descriptions){
            if(!nodes.containsKey(d[1])){
                nodes.put(d[1], new TreeNode(d[1]));
            }
            if(!nodes.containsKey(d[0])){
                nodes.put(d[0], new TreeNode(d[0]));
                heads.add(d[0]);
            }
            
            if(heads.contains(d[1])){
                heads.remove(Integer.valueOf(d[1]));
            }
            TreeNode current = nodes.get(d[0]);
            if(d[2] == 1){
                current.left = nodes.get(d[1]);
            }
            else{
                current.right = nodes.get(d[1]);
            }
            
        }
        
        return nodes.get(heads.get(0));
        
    }
}