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
        int counter = 0;
        while(current != null){
            if(counter % 2 == 0){
                current.val = nodes.get(index);
            }
            else{
                current.val = nodes.get(nodes.size() - (1 + index));
                index++;
            }
            counter++;
            current = current.next;
        }
        
    }
}