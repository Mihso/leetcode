class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        
        while(start < nums.length - 1){
            
            for(int i = start; i < nums.length; i++){
                if(nums[i] < nums[start]){
                    int store = nums[i];
                    nums[i] = nums[start];
                    nums[start] = store;
                }
            }
            
            start++;
        }
    }
}