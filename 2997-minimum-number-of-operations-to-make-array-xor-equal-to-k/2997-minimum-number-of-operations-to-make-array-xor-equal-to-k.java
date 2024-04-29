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
        
        System.out.println(xor%2);
        
        while(xor > 0 || k > 0){
            
            int xorlast = xor%2;
            int klast = k%2;
            
            System.out.print(xorlast);
            System.out.print(" : ");
            System.out.println(klast);
            if(xorlast != klast){
                counter += 1;
            }
            
            xor /= 2;
            k /=2;
        }
        
        return counter;
    }
}