class Solution {
    public int maxDepth(String s) {
        int counter = 0;
        int finall = 0;
        for(int i =0; i < s.length(); i++){
            char cal = s.charAt(i);
            if(cal == '('){
                counter += 1;
            }
            else if(cal == ')'){
                counter -= 1;
            }
            
            if(counter > finall){
                finall += 1;
            }
            
            }
            
        
        return finall;
    }
}