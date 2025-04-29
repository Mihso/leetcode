class Solution {
    public long countSubarrays(int[] nums, int k) {
        long answer = 0;
        int maximum = Integer.MIN_VALUE;
        long counter = 0;
        int left = 0;
        for(int i: nums){
            maximum = Math.max(maximum, i);
        }
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == maximum){
                counter += 1;
            }
            while(counter >= k){
                if(nums[left] == maximum){
                    counter -= 1;
                }
                left += 1;
            }
            answer += left;
        }

        return answer;
    }
}