class Solution {
    public int[] frequencySort(int[] nums) {
        
        Integer[] copy= new Integer[nums.length];
        for(int i = 0; i <  nums.length; i++){
            copy[i] = nums[i];
        }
        
        Arrays.sort(copy, (a,b) -> {
            if(freq(nums,a) == freq(nums,b))
            {
                return Integer.compare(b,a);
            }
            return Integer.compare(freq(nums,a),freq(nums,b));
            });
        
        for(int i = 0; i <  nums.length; i++){
            nums[i] = copy[i];
        }
        return nums;
    }
    
    private int freq(int[] nums, int value){
        int answer = 0;
        for(int i: nums){
            if(i == value){
                answer++;
            }
        }
        return answer;
    }
}