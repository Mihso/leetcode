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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> answer = new ArrayList<>();
        traverse(root,new ArrayList<Integer>(), targetSum, answer);
        return answer;
    }
    
    private void traverse(TreeNode root, List<Integer> path, int targetSum, List<List<Integer>> answer){
        if(root != null){
            path.add(root.val);
            if(root.left == null && root.right == null){
                int sum = 0;
                for(int i: path){
                    sum += i;
                }
                if(sum == targetSum){
                    List<Integer> copy = new ArrayList<>(path);
                    answer.add(copy);
                }
            }
            else{
                traverse(root.left, path, targetSum, answer);
                traverse(root.right, path, targetSum, answer);
            }
            path.remove(path.size() - 1);
        }
    }
}