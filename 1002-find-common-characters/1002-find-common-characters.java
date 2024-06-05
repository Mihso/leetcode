class Solution {
    public List<String> commonChars(String[] words) {
        
        int[] letters = new int[26];
        int[] checker = new int[26];
        Arrays.fill(letters, Integer.MAX_VALUE);
        List<String> answer = new ArrayList<>();
        
        for(String s: words){
            Arrays.fill(checker, 0);
            for(char c: s.toCharArray()){
                checker[c-'a'] += 1;
            }
            
            for(int i = 0; i < 26; i++){
                letters[i] = Math.min(checker[i], letters[i]);
            }
            
        }
        
        for(int i = 0; i < 26; i++){
            for(int x = 0; x < letters[i]; x++){
                answer.add(String.valueOf((char)('a'+ i)));
            }
        }
            
        return answer;
        
    }
}