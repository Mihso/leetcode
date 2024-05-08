class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1] && !answer.contains(nums[i])){
                answer.add(nums[i]);
            }
        }
        
        return answer;
        
    }
}