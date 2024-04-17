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
    
    public String smallestFromLeaf(TreeNode root) {
        System.out.println(getter(root, new String()));
        return getter(root, new String());
    }
    
    public String getter(TreeNode noder, String values){
        if(noder == null){
            return null;
        }
        String copy= new String(values);
        copy = Character.toString((char) noder.val + 97) + copy;
        if(noder.left == null && noder.right == null){
            return copy;
        }
        else{
            String lefter = getter(noder.left, copy);
            String righter = getter(noder.right, copy);
            if(lefter != null && righter!= null){
                if(compare(lefter, righter)){
                    return lefter;
                }
                else{
                    return righter;
                }
            }
            else if(lefter == null && righter != null){
                return righter;
            }
            else{
                return lefter;
            }
        }
    }
    
    public Boolean compare(String a, String b){
        int i = 0;
        while(i < a.length() && i < b.length()){
            if(a.charAt(i) < b.charAt(i)){
                return true;
            }
            else if(a.charAt(i) > b.charAt(i)){
                return false;
            }
            else{
                i++;
            }
        }
        if(a.length() < b.length()){
            return true;
        }
        return false;
    }
}