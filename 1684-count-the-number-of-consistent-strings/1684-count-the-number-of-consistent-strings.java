class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int answer = 0;
        for(String word : words){
            boolean valid = true;
            for(int i = 0; i < word.length(); i++){
                if(!allowed.contains(word.substring(i, i + 1))){
                    valid = false;
                }
            }
            if(valid){
                answer++;
            }
        }
        return answer;
    }
}