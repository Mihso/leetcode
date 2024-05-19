class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length-1){
            if(nums[i] != nums[i + 1]){
                return nums[i];
            }
            else{
                i += 2;
            }
        }
        
        return nums[nums.length-1];
    }
}