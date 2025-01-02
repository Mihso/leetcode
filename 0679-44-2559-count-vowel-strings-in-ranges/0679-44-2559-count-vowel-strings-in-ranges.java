class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int[] answer = new int[queries.length];
        int[] validator = new int[words.length];
        int summer = 0;
        for(int i = 0; i < validator.length; i++){
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))){
                    summer += 1;
                }
                validator[i] = summer;
        }
        for(int i = 0; i < queries.length; i++){
            answer[i] = validator[queries[i][1]] - 
            (queries[i][0] == 0 ? 0 : validator[queries[i][0] - 1]);
        }
        return answer;
    }
}