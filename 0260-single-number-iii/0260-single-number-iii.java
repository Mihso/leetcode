class Solution {
    public int[] singleNumber(int[] nums) {
        int[] answer = new int[2];
        Arrays.sort(nums);
        int index = 0;
        int inner = 0;
        while(index < nums.length){
            if(index == nums.length - 1 || nums[index] != nums[index + 1]){
                answer[inner] = nums[index];
                index += 1;
                inner += 1;
            }
            else{
                index += 2;
            }
        }
        return answer; 
    }
}