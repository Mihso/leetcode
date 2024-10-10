class Solution {
    public int maxWidthRamp(int[] nums) {
        int ramp = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < nums.length; i++){
            if(stack.isEmpty() || nums[stack.peek()] > nums[i]){
                stack.push(i);
            }
        }
        for(int j = nums.length - 1; j >= 0; j--){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[j]){
                ramp = Math.max(ramp, j - stack.peek());
                stack.pop();
            }
        }
        return ramp;
        
    }
}