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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head.next;
        int[] answer = new int[]{-1,-1};
        int previous = head.val;
        int counter = 0;
        while(current.next != null){
            if(current.val > previous && current.val > current.next.val){
                values.add(counter);
            }
            else if(current.val < previous && current.val < current.next.val){
                values.add(counter);
            }
            counter++;
            previous = current.val;
            current = current.next;
        }
        
        if(values.size() < 2){
            return new int[]{-1,-1};
        }
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < values.size() - 1; i++){
            mini = Math.min(mini, values.get(i + 1) - values.get(i));
        }
        
        return new int[]{mini, values.get(values.size()-1) - values.get(0)};
        
    }
}