class Solution {
    public int waysToSplitArray(int[] nums) {
        long total = 0;
        for(int i : nums){
            total += i;
        }

        int counter = 0;
        long lefter = 0;
        for(int i = 0; i < nums.length - 1; i++){
            total -= nums[i];
            lefter += nums[i];
            if(lefter >= total){
                counter += 1;
            }
        }
        return counter;
    }
}