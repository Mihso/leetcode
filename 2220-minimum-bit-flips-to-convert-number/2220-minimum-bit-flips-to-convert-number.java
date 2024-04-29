class Solution {
    public int minBitFlips(int start, int goal) {
        int counter = 0;
        
        while(start != goal){
            int startlast = start%2;
            int goallast = goal%2;
            
            if(goallast != startlast){
                counter += 1;
            }
            
            start /= 2;
            goal /=2;
            
        }
        
        return counter;
    }
}