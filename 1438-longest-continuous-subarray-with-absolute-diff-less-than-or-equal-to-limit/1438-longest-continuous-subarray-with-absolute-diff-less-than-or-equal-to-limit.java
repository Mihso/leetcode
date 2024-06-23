class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int counter = 0;
        int index = 0;
        int maxi = 0;
        int mini = 0;
        int start = 0;
        while(index < nums.length){
            if(nums[index] >= nums[maxi]){
             maxi = index;   
            }
            if(nums[index] <= nums[mini]){
                mini = index;
            }
            if(nums[maxi] - nums[mini] <= limit){
                counter = Math.max(counter, index - start + 1);
            }
            else{
                start = Math.min(maxi, mini) +1;
                index = start;
                maxi = start;
                mini = start;
            }
            index++;
        }
        
        return counter;
    }
    
}