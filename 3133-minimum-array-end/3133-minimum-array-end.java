class Solution {
    public long minEnd(int n, int x) {
        long result = x;
        
        for(int i = 1 ;i < n; i ++){
            result += 1;
            result |= x;
        }
        return result;
        
        
    }
}