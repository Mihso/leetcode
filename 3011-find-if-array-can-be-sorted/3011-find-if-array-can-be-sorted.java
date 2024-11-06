class Solution {
    public boolean canSortArray(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = nums.length - 1; j > i; j--){
                if(nums[j] < nums[j-1] && setBit(nums[j])== setBit(nums[j-1])){
                    int store = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = store;
                }
            }
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                return false;
            }
        }
        return true;
    }
    
    private int setBit(int i){
        String binary = Integer.toBinaryString(i);
        int counter = 0;
        for(int index = 0; index < binary.length(); index++){
            if(binary.charAt(index) == '1'){
                counter += 1;
            }
        }
        return counter;
        
    }
}