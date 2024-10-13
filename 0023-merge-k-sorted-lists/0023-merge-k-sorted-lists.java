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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode answer = new ListNode(0);
        
        ArrayList<Integer> values = new ArrayList<>();
        
        for(ListNode l: lists){
            ListNode current = l;
            while(current != null){
                values.add(current.val);
                current = current.next;
            }
        }
        
        Collections.sort(values);
        ListNode tracker = answer;
        for(int i: values){
            tracker.next = new ListNode(i);
            tracker = tracker.next;
        }
        return answer.next;
        
        
    }
}