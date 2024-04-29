class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;
        
        for(int i: nums){
            xor = xor^i;
        }
        
        int counter= 0;
        if(xor == k){
            return counter;
        }
        
        while(xor > 0 || k > 0){
            
            int xorlast = xor%2;
            int klast = k%2;
            
            if(xorlast != klast){
                counter += 1;
            }
            
            xor /= 2;
            k /=2;
        }
        
        return counter;
    }
}