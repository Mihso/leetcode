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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode answer = head;
        
        List<Integer> values = new ArrayList<>();
        
        while(answer != null){
            values.add(answer.val);
            answer = answer.next;
        }
        
                
        if(values.size() <= 1){
            return head;
        }
        
        int loops = k % values.size();
        
        for(int i = 0; i < loops; i++){
            int v = values.get(values.size() - 1);
            values.remove(values.size() -1);
            values.add(0,v);
        }
        answer = new ListNode(values.get(values.size() - 1));
        for(int i = values.size() - 2; i >= 0; i--){
            answer = new ListNode(values.get(i), answer);
        }
        
        return answer;
    }
}