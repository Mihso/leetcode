class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        if(nums.length <= 4){
            return 0;
        }
        
        int answer = Integer.MAX_VALUE;
        
        for(int left = 0, right = nums.length - 4; left < 4; left++, right++){
            answer = Math.min(answer, nums[right] - nums[left]);
        }
        return answer;
    }
}