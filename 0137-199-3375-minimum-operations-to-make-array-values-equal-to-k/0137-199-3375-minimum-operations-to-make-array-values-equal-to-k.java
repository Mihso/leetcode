class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int maxi = nums[nums.length - 1];
        int operations = 0;
        int index = nums.length - 1;
        while(index >= 0 && maxi >= k){

            while(index >= 0 && nums[index] == maxi){
                index -= 1;
            }

            if(index >= 0){
                operations += 1;
                maxi = nums[index];
            }

        }
        if(index > 0){
            return -1;
        }
        else if(maxi < k){
            return -1;
        }
        if(maxi > k){
            operations += 1;
        }
        return operations;
    }
}