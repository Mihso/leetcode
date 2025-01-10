class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> answer = new ArrayList<>();
        List<Map<Character, Integer>> values1 = new ArrayList<>();
        Map<Character, Integer> frequency = new HashMap<>();
        for(String word: words1){
            Map<Character, Integer> current = new HashMap<>();
            for(int i = 0; i < word.length(); i++){
                int counter = current.getOrDefault(word.charAt(i), 0);
                current.put(word.charAt(i), counter + 1);
            }
            values1.add(current);
        }
    for(String word: words2){
            Map<Character, Integer> current = new HashMap<>();
            for(int i = 0; i < word.length(); i++){
                int counter = current.getOrDefault(word.charAt(i), 0);
                current.put(word.charAt(i), counter + 1);
            }
            for(char key: current.keySet()){
                int counter = frequency.getOrDefault(key, 0);
                frequency.put(key, Math.max(counter, current.get(key)));
            }
        }
    for(int i = 0; i < words1.length; i++){
        Map<Character, Integer> current = values1.get(i);
        boolean invalid = false;

        for(char key: frequency.keySet()){
            if(!current.containsKey(key) || current.get(key) < frequency.get(key)){
                invalid = true;
                break;
            }
        }

        if(!invalid){
            answer.add(words1[i]);
        }
    }

    return answer;
    }
}