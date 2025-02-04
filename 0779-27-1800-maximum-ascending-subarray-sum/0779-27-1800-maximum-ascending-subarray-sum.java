class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxi = nums[0];
        int current = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                current += nums[i]; 
            }
            else{
                maxi = Math.max(maxi, current);
                current = nums[i];
            }
        }
        maxi = Math.max(maxi, current);

        return maxi;
    }
}