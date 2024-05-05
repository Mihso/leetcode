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
    public ListNode removeNodes(ListNode head) {
        ListNode current = head;
        Stack<Integer> lister = new Stack<>();
        while(current != null){
            while(!lister.isEmpty() && current.val > lister.peek()){
                lister.pop();
            }
            lister.push(current.val);
            current = current.next;
        }
        System.out.println(lister.peek());
        ListNode answer = new ListNode(lister.pop());
        ListNode track = answer;
        while(!lister.isEmpty()){
            answer = new ListNode(lister.pop(), track);
            track = answer;
        }
        
        return answer;
    }
}