class Solution {
    public int[] sortArray(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int n: nums){
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        
        int values = max - min + 1;
        int[] counter = new int[values];
        
        Arrays.fill(counter, 0);
        
        for(int n: nums){
            counter[n - min] += 1;
        }
        
        int index = 0;
        for(int i = 0; i < values; i++){
            while(counter[i] > 0){
                counter[i] -= 1;
                nums[index] = i + min;
                index++;
            }
        }
        
        return nums;
        
    }
}