class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long counterUpper = 0;
        long counterLower = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int summer = nums[left] + nums[right];
            if(summer <= upper){
                counterUpper += right - left;
                left += 1;
            }
            else{
                right -= 1;
            }
        }
        left = 0;
        right = nums.length - 1;
        while(left < right){
            int summer = nums[left] + nums[right];
            if(summer < lower){
                counterLower += right - left;
                left += 1;
            }
            else{
                right -= 1;
            }
        }
        return counterUpper - counterLower;
    }
}