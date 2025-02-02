class Solution {
    public boolean check(int[] nums) {
        int start = 0;

        while(start < nums.length - 1 && nums[start] <= nums[start + 1]){
            start += 1;
        }
        if(start >= nums.length - 1){
            return true;
        }
        start += 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[(i + start) % nums.length] > nums[(i + start  + 1) % nums.length]){
                return false;
            }
        }

        return true;

    }
}