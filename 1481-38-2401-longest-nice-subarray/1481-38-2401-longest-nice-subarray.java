class Solution {
    public int longestNiceSubarray(int[] nums) {
        int start = 0;
        int answer = 1;
        int used = 0;
        for(int right = 0; right < nums.length; right++){
            while((used & nums[right]) != 0){
                used ^= nums[start];
                start += 1;
            }
            used |= nums[right];
            answer = Math.max(answer, right - start + 1);
        }
        return answer;
    }
}