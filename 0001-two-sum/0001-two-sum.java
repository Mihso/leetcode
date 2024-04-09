class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int[] answer = {left,right}; 

        while(left < right){
            if(nums[left] + nums[right] == target){
                answer[0] = left;
                answer[1] = right;
                return answer;
            }
            for(int i = left + 1; i <= right - 1; i++){
                if(nums[left] + nums[i] == target){
                    answer[1] = i;
                    answer[0] = left;
                    return answer;
                }
                else if(nums[right] + nums[i] == target){
                    answer[0] = i;
                    answer[1] = right;
                    return answer;
                }
            }
                            
                left += 1;
                right -= 1;
        }
        return answer;
    }
}