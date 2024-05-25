class Solution {
    List<String> sentences = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        sent(s, 0, "", wordDict);
        return sentences;
    }
    
    public void sent(String s, int start, String current, List<String> wordDict){
        if(start > s.length() - 1){
            sentences.add(current.substring(0, current.length() - 1));
        }
        else{
        for(int i = start; i < s.length(); i++){
            String sub = s.substring(start, i + 1);
            if(wordDict.contains(sub)){
                String copy = current;
                
                copy += sub + " ";
                sent(s, i + 1, copy, wordDict);
            }
        }
        }
    }
}