class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int counter = 0;
        
        while(!nums.isEmpty()){
            int first = nums.remove(0);
            for(int i: nums){
                if(first + i < target){
                    counter += 1;
                }
            }
        }
        return counter;
    }
}