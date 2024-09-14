class Solution {
    public int longestSubarray(int[] nums) {
        int longest = 0;
        int maxBit = 0;
        int streak = 0;
        for(int i: nums){
            if(maxBit < i){
                maxBit = i;
                longest = streak = 0;
            }
            
            if(maxBit == i){
                streak++;
            }
            else{
                streak = 0;
            }
            
            longest = Math.max(longest, streak);
        }
        
        return longest;
    }
}