class Solution {
    public String reversePrefix(String word, char ch) {
        int x = -1;
        String answer = "";
        int i = 0;
        while(x == -1 && i < word.length()){
            if(word.charAt(i) == ch){
                x = i;
            }
            i++;
        }
        
        if(x != -1){
            for(int b = x; b >= 0; b--){
                answer += word.charAt(b);
            }
        }
        
        if(x == -1){
            return word;
        }
        
        answer += word.substring(x+1, word.length());
            
        return answer;
        
    }
}