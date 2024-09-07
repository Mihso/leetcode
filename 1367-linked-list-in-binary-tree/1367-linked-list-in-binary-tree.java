/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root.val == head.val){
            if(subber(head, root)){
                return true;
            }
        }
        boolean left = false;
        boolean right = false;
        if(root.left != null){
            left = isSubPath(head, root.left);
        }
        if(root.right != null){
            right = isSubPath(head, root.right);
        }
        
        return left || right;
        
    }
    
    private boolean subber(ListNode head, TreeNode root){
        if(head == null){
            return true;
        }
        boolean left = false;
        boolean right = false;
        if(root != null && head.val == root.val){
            left = subber(head.next, root.left);
            right = subber(head.next, root.right);
        }
        return left || right;
    }
    
    
}