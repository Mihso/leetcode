class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n: nums){
            sum += n;
        }
        if(sum % 2 == 1){
            return false;
        }
        dp = new Boolean[nums.length][(sum / 2) + 1];

        return helper(nums, 0, sum / 2);
    }

    private boolean helper(int[] nums, int index, int goal){
        if(goal < 0){
            return false;
        }
        if(0 == goal){
            return true;
        }
        if(index >= nums.length){
            return false;
        }
        if(dp[index][goal] != null){
            return dp[index][goal];
        }
        if(helper(nums, index + 1, goal - nums[index])){
            return dp[index][goal] = true;
        }
        return dp[index][goal] = helper(nums, index + 1, goal);
    }
}