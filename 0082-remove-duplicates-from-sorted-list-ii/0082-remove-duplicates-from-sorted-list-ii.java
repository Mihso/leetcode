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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> multiple = new HashSet<>();
        ListNode newer = new ListNode(0);
        ListNode current = head;
        
        while(current != null){
            if(current.next != null && current.next.val == current.val){
                multiple.add(current.val);
            }
            current = current.next;
        }
        
        current = head;
        ListNode copy = newer;
        while(current != null){
            if(!multiple.contains(current.val)){
                copy.next = new ListNode(current.val);
                copy = copy.next;
            }
            current = current.next;
        }
        
        return newer.next;
        
    }
}