class Solution {
    
        public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int W = words.length;
        // Count how many times each letter occurs
        int[] freq = new int[26];
        for (char c: letters) {
            freq[c - 'a']++;
        }
        int maxScore = 0;
        // Iterate over every subset of words
        int[] subsetLetters = new int[26];
        for (int mask = 0; mask < 1 << W; mask++) {
            // Reset the subsetLetters array
            Arrays.fill(subsetLetters, 0);
            for (int i = 0; i < W; i++) {
                if ((mask & (1 << i)) > 0) {
                    // Count the letters in this word
                    int L = words[i].length();
                    for (int j = 0; j < L; j++) {
                        subsetLetters[words[i].charAt(j) - 'a']++;
                    }
                }
            }
            maxScore = Math.max(maxScore, subsetScore(subsetLetters, score, freq));
        }
        return maxScore;
    }

    private int subsetScore(int[] subsetLetters, int[] score, int[] freq) {
        int totalScore = 0;
        // Calculate score of subset
        for (int c = 0; c < 26; c++) {
            totalScore += subsetLetters[c] * score[c];
            // Check if we have enough of each letter to build this subset of words
            if (subsetLetters[c] > freq[c]) {
                return 0;
            }
        }
        return totalScore;
    }
//     public int maxScoreWords(String[] words, char[] letters, int[] score) {
//         Map<Character, Integer> tracker = new HashMap<>();
//         Map<Map<Character, Integer>, Integer> scores = new HashMap<>();
//         for(char c: letters){
//             if(!tracker.containsKey(c)){
//                 tracker.put(c, 0);
//             }
//             tracker.replace(c, tracker.get(c) + 1);
//         }
        
//         for(String w: words){
//             Map<Character, Integer> worder = wordTrack(w);
//             int i = 0;
//             for(char c: worder.keySet()){
//                 i += worder.get(c) * score[Integer.valueOf(c) - 97];
//             }
            
//             scores.put(worder, i);
//         }
        
//         System.out.println(scores);
        
//         for(char s : tracker.keySet()){
//             System.out.println(tracker.get(s));
//         }
        
//         return 0;
//     }
    
//     public Map<Character, Integer> wordTrack(String word){
//         Map<Character, Integer> tracker = new HashMap<>();
        
//         for(int i =0; i < word.length(); i++){
//             char c = word.charAt(i);
//             if(!tracker.containsKey(c)){
//                 tracker.put(c, 0);
//             }
//             tracker.replace(c, tracker.get(c) + 1);
//         }
//         return tracker;
//     }
}