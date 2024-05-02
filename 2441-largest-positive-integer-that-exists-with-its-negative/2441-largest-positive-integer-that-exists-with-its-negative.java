class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right){
            if(Math.abs(nums[left]) == nums[right] && nums[left] < 0){
                return nums[right]; 
            }
            
            if(nums[right] < Math.abs(nums[left])){
                left += 1;
            }
            else{
                right -= 1;
            }
        }
        
        return -1;
        
    }
}