class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(int i: nums){
            counter.put(i, counter.getOrDefault(i, 0) + 1);
        }
        int operations = 0;
        int index = 0;
        while(!helper(counter)){
            int end = Math.min(index + 3, nums.length);
            for(int i = index; i < end; i++){
                counter.put(nums[i], counter.get(nums[i]) - 1);
            }

            index = end;
            operations += 1;
        }

        return operations;
    }

    private boolean helper(Map<Integer, Integer> counter){
        for(int i: counter.keySet()){
            if(counter.get(i) > 1){
                return false;
            }
        }

        return true;
    }
}