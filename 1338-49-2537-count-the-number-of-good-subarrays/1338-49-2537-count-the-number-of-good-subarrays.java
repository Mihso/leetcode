class Solution {
    public long countGood(int[] nums, int k) {
        long answer = 0;
        long count = 0;
        int left = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int r = 0; r < nums.length; r++){
            int x = nums[r];
            count += freq.getOrDefault(x, 0);
            freq.put(x, freq.getOrDefault(x, 0) + 1);

            while(count >= k){
                answer += (nums.length - r);
                freq.put(nums[left], freq.getOrDefault(nums[left], 0) - 1);
                count -= freq.get(nums[left]);
                left++;
            } 
        }
        return answer;
    }
}