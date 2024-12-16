class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<Integer> values = new PriorityQueue<>((a,b) -> {
            if(nums[a] != nums[b]){
                return nums[a] - nums[b];
                }
            else{
                return a-b;
            }
            });
        for(int i = 0; i < nums.length; i++){
            values.add(i);
        }
        for(int i = 0; i < k; i++){
            int current = values.poll();
            nums[current] *= multiplier;
            values.add(current);
        }
        return nums;
    }
}