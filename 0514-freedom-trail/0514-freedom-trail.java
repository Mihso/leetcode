class Solution {
    public int findRotateSteps(String ring, String key) {
        int[]curr= new int[ring.length()];
        int[] prev = new int[ring.length()];
        Arrays.fill(prev, 0);
        for(int k = key.length() - 1; k >= 0; k--){
            Arrays.fill(curr, Integer.MAX_VALUE);
            for(int r = 0; r < ring.length(); r++){
                for(int c = 0; c < ring.length(); c++){
                if(ring.charAt(c) == key.charAt(k)){
                    curr[r] = Math.min(curr[r], 1 + diff(ring.length(), r, c) + prev[c]);
                }
            }
            }
            prev = curr.clone();
        }
        return prev[0];
    }
    
    public int diff(int length,int i, int c){
        int id = Math.abs(i-c);
        int ld = length - id;
        return Math.min(id, ld);
    }
    
}