class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int counter = 0;
        for(int i = 0; i < words.length - 1; i++){
            for(int j = i + 1 ; j < words.length; j++){
                if(words[i].length() <= words[j].length()){
                    String prefix = words[j].substring(0, words[i].length());
                    String suffix = words[j].substring(words[j].length() - words[i].length(), words[j].length());
                    if(words[i].equals(prefix) && words[i].equals(suffix)){
                        counter += 1;
                    }
                }
            }
        }
        return counter;
    }
}