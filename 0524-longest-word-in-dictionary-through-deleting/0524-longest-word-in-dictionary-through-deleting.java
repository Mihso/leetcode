class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        List<String> found = new ArrayList<>();
        for(String word: dictionary){
            int ind = 0;
            for(int c = 0; c < s.length(); c++){
                if(ind < word.length() && s.charAt(c) == word.charAt(ind)){
                    ind += 1;
                }
            }
            
            if(ind >= word.length()){
                found.add(word);
            }
            
        }
        
        Collections.sort(found);
        String answer = "";
        for(String word: found){
            if(answer.length() < word.length()){
                answer = word;
            }
        }
        
        return answer;
    }
}