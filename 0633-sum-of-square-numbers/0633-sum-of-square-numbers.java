class Solution {
    public boolean judgeSquareSum(int c) {
        List<Integer> vals = new ArrayList<>();
        int count = 0;
        
        while(Math.pow(count, 2) <= c){
            int sq = (int)Math.sqrt(c - ((int)Math.pow(count, 2)));
            if(Math.sqrt(c-((int)Math.pow(count, 2))) == sq ){
                return true;
            }
            count++;
        }
        
        return false;
        
    }
    
}