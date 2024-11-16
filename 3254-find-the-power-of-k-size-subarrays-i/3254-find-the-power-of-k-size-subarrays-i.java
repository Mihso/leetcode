class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        for(int i = 0; i < (nums.length - k + 1); i++){
            result[i] = powerOf(i, i + k - 1, nums);
        }
        return result;
        
    }
    
    private int powerOf(int start, int end, int[] nums){
        int current = nums[start];
        for(int i = start; i <= end; i++){
            if(nums[i] != current){
                return - 1;
            }
            current++;
        }
        return nums[end];
    }
}