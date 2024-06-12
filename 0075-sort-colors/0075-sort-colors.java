class Solution {
    public void sortColors(int[] nums) {
        int current = nums.length -1;
        
        while(current > 0){
            int index = current;
            for(int i = current; i >= 0; i--){
                if(nums[i] > nums[index]){
                    index = i;
                }
            }
            if(nums[current] < nums[index]){
                int hold = nums[current];
                nums[current] = nums[index];
                nums[index] = hold;
            }
            current--;
        }
    }
}