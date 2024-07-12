class Solution {
    public int maximumGain(String s, int x, int y) {
        int acount = 0;
        int bcount = 0;
        int totalpoints = 0;
        
        if(x < y){
            int store = x;
            x = y;
            y = store;
            String newwer = "";
            for(int i = 0; i < s.length(); i++){
                newwer = s.charAt(i) + newwer;
            }
            s = newwer;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                acount++;
            }
            else if(s.charAt(i) == 'b'){
                if(acount > 0){
                    acount--;
                    totalpoints += x;
                }
                else{
                    bcount++;
                }
            }
            else{
                totalpoints += Math.min(acount, bcount) * y;
                acount = 0;
                bcount = 0;
            }
        }
        
        totalpoints += Math.min(acount, bcount) *y;
        
        
        return totalpoints;
        
    }
}