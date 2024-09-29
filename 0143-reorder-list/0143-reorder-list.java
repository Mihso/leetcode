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
    public void reorderList(ListNode head) {
        List<Integer> nodes = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            nodes.add(current.val);
            current = current.next;
        }
        current = head;
        int index = 0;
        boolean counter = true;
        while(current != null){
            if(counter){
                current.val = nodes.get(index);
                counter = false;
            }
            else{
                current.val = nodes.get(nodes.size() - (1 + index));
                index++;
                counter = true;
            }
            current = current.next;
        }
        
    }
}