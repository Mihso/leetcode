class Solution {
    public int appendCharacters(String s, String t) {
        int index = 0;
        for(char c: s.toCharArray()){
            if(t.charAt(index) == c){
                index += 1;
            }
            if(index >= t.length()){
                return 0;
            }
        }
        
        return t.length() - index;
    }
}