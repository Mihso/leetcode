class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> values = new HashMap<>();
        long good = 0;
        for(int i = 0; i < nums.length; i++){
            int current = nums[i] - i;
            good += values.getOrDefault(current, 0);
            values.put(current, values.getOrDefault(current, 0) + 1);
        }
        long answer = 1L * (nums.length) * (nums.length - 1) / 2;
        return answer - good;
    }
}