class Solution {
    public long minimumSteps(String s) {
        long counter = 0;
        int wpointer = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                counter += i - wpointer;
                wpointer += 1;
            }
        }
        
        return counter;
        
    }
}