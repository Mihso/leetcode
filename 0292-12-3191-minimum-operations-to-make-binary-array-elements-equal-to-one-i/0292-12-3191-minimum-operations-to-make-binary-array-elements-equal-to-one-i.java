class Solution {
    public int minOperations(int[] nums) {
        boolean[] valid = new boolean[nums.length];
        Arrays.fill(valid, false);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                valid[i] = true;
            }
        }
        int swaps = 0;
        for(int i = 0; i < nums.length - 2; i++){
            if(!valid[i]){
                for(int y = i; y < i + 3; y++){
                    valid[y] = !valid[y];
                }
                swaps += 1;
            }
        }
        if(valid[valid.length - 1] && valid[valid.length - 2]){
            return swaps;
        }
        return -1;
    }
}