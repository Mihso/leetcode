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
class FindElements {
    TreeNode tree;
    public FindElements(TreeNode root) {
        this.tree = root;
        this.tree.val = 0;
        convert(this.tree);
        
    }

    private void convert(TreeNode root){
        if(root.left != null){
            root.left.val = (2 * root.val) + 1;
            convert(root.left);
        }
        if(root.right != null){
            root.right.val = (2 * root.val) + 2;
            convert(root.right);
        }
    }
    
    public boolean find(int target) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this.tree);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.val == target){
                return true;
            }
            else{
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
        }
        return false;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */