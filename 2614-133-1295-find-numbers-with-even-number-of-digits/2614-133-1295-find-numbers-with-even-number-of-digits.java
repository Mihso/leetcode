class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for(int i: nums){
            boolean even = false;
            int current = i;
            while(current > 9){
                current /= 10;
                even = !even;
            }

            if(even){
                counter += 1;
            }

        }
        return counter;
    }
}