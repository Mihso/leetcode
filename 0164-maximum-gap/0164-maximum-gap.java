class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2){
            return 0;
        }
        
        int answer = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 1; i++){
            answer = Math.max(answer, nums[i + 1] - nums[i]);
        }
        return answer;
        
    }
}