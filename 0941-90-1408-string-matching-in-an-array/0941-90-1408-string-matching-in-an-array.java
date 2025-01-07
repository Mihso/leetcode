class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();
        for(String word: words){
            for(String word2: words){
                if(word.contains(word2) && word != word2 && !answer.contains(word2)){
                    answer.add(word2);
                }
            }
        }
        return answer;
    }
}