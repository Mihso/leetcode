class Solution {
    public int minimumDeletions(String s) {
        int[] A = new int[s.length()];
        int[] B = new int[s.length()];
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            B[i] = count;
            if(s.charAt(i) == 'b'){
                count++;
            }
        }
        count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            A[i] = count;
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        
        int min = s.length();
        
        for(int i = 0; i < s.length(); i++){
            min = Math.min(min, A[i] + B[i]);
        }
        return min;
    }
}