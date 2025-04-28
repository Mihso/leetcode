class Solution {
    public long countSubarrays(int[] nums, long k) {
        long answer = 0;
        int start = 0;
        int index = 0;
        long current = 0;

        for(int i = 0; i < nums.length; i++){
            current += nums[i];
            while(current * (i - start + 1) >= k ){
                current -= nums[start++];
            }
            answer += (i- start + 1);
        }
        return answer;
    }
}