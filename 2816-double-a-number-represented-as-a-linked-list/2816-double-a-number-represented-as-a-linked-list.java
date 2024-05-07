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
    public ListNode doubleIt(ListNode head) {
        List<Integer> value = new ArrayList<>();
        
        ListNode current = head;
        
        while(current != null){
            value.add(current.val);
            current = current.next;
        }
        
        
        int carry = 0;
        
        for(int i = value.size() - 1; i >= 0; i--){
            int getter = (value.get(i) * 2) + carry;
            value.set(i, getter % 10);
            carry = getter / 10;
        }
        
        ListNode noder = new ListNode(value.get(value.size() - 1));
        for(int i = value.size() - 2; i >= 0; i--){
            noder = new ListNode(value.get(i), noder);
        }
        if(carry == 0){
            return noder;
        }
        return new ListNode(carry, noder);
        
    }
}