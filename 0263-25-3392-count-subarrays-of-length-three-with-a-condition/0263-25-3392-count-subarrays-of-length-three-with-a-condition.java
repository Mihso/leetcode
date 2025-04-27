class Solution {
    public int countSubarrays(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length - 2; i++){
            Float middle = (float)nums[i + 1] / 2;
            Float edge = (float) nums[i]  + nums[i + 2];
            if(middle.equals(edge)){
                answer += 1;
            }
        }

        return answer;
    }
}