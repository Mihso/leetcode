class Solution {
    public int subsetXORSum(int[] nums) {
        return subsetter(nums, 0);
    }
    
    public int subsetter(int[] nums, int start){
        int val = 0;
        
        for(int i: nums){
            val= val ^ i;
        }
        
        for(int i = start; i < nums.length; i ++){
            if(nums[i] != 0){
            int orig = nums[i];
            nums[i] = 0;
            val += subsetter(nums, i);
            nums[i] = orig;
            }
        }
        return val;
    }
    
}