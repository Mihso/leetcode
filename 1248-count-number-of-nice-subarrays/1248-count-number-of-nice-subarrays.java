class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int index = 0;
        int odd = 0;
        int prefix= 0;
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] % 2 !=0 ){
                odd++;
                prefix = 0;
            }
            
            while(odd == k && index <= i){
                if(nums[index] %2 != 0){
                    odd--;
                }
                index++;
                prefix++;
            }
            counter += prefix;
            
        }
        
        return counter;
    }
    
}