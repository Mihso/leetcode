class Solution {
    public int minIncrementForUnique(int[] nums) {
        int counter = 0;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            while(nums[i] <= nums[i-1]){
                int dif = (nums[i-1] + 1) - nums[i];
                nums[i] = nums[i - 1]+ 1;
                counter += dif;
            }
        }
        
        return counter;
    }
}