class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int summer = 0;
        int start = 0;
        int maxi = 0;
        
        List<Integer> subber = new ArrayList<>();
        
        for(int i = 0; i < customers.length; i++){
            if(grumpy[i] == 0){
                summer += customers[i];
            }
        }
        
        
        for(int i = 0; i < customers.length- minutes + 1; i++){
                int check = 0;
                for(int y = 0; y < minutes; y++){
                    if(grumpy[i + y] == 1){
                        check += customers[i+y];
                    }
                }
                
                maxi = Math.max(maxi, check);
        }
        
        return summer + maxi;
    }
    
}