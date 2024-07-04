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
    public ListNode mergeNodes(ListNode head) {
        ListNode answer = new ListNode(0);
        ListNode CurAns = answer;
        ListNode current = head;
        while(current.val == 0){
            current = current.next;
        }
        
        while(current.next != null){
            if(current.val != 0){
                CurAns.val += current.val;
            }
            else{
                CurAns.next = new ListNode(0);
                CurAns = CurAns.next;
            }
            current = current.next;
        }
        
        if(current.val != 0){
            CurAns.val += current.val;
        }
        
        return answer;
        
    }
}