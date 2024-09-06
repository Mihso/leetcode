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
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> remover = new HashSet<>();
        
        for(int i: nums){
            remover.add(i);
        }
        
       while(remover.contains(head.val)){
           head = head.next;
       }
        
        ListNode current = head;
        
        while(current != null){
            while(current.next != null && remover.contains(current.next.val)){
                current.next = current.next.next;
            }
            current = current.next;
        }
        
        return head;
        
        
    }
}