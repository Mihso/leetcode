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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] answer = new int[m][n];
        
        for(int[] i : answer){
            Arrays.fill(i, -1);
        }
        
        int top = 0;
        int bottom = m - 1;
        int left= 0;
        int right = n - 1;
        ListNode current = head;
        while(left <= right && current != null){
            for(int x = left; x <= right; x++){
                if(current != null){
                    answer[top][x] = current.val;
                    current = current.next;
                }
            }
            top++;
            for(int y = top; y <= bottom; y++){
                if(current != null){
                    answer[y][right] = current.val;
                    current = current.next;
                }
            }
            right--;
            for(int x = right; x >= left; x--){
                if(current != null){
                    answer[bottom][x] = current.val;
                    current = current.next;
                }
            }
            bottom--;
            for(int y = bottom; y >= top; y--){
                if(current != null){
                    answer[y][left] = current.val;
                    current = current.next;
                }
            }
            left++;
        }
        
        return answer;
        
    }
}