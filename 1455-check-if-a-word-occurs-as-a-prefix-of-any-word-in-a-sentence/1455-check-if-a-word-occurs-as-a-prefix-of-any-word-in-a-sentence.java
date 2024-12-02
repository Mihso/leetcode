class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] splitter = sentence.split(" ");
        for(int i = 0; i < splitter.length; i++){
            if(splitter[i].length() >= searchWord.length()){
            boolean match = true;
            for(int x = 0; x < searchWord.length(); x++){
                if(splitter[i].charAt(x) != searchWord.charAt(x)){
                    match = false;
                }
            };
            
            if(match){
                return i + 1;
            }
            }
        }
        
        return -1;
        
    }
}