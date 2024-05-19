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
        ListNode answer = new ListNode();
        Queue<Integer> vals = new PriorityQueue<>(Collections.reverseOrder());
        for(ListNode l: lists){
            ListNode current = l;
            while(current != null){
                vals.add(current.val);
                current = current.next;
            }
        }
        
        if(vals.isEmpty()){
            return null;
        }
        ListNode copy = new ListNode(vals.poll());
        answer = copy;
        while(!vals.isEmpty()){
            answer = new ListNode(vals.poll(), copy);
            copy = answer;
        }
        return answer;
    }
}