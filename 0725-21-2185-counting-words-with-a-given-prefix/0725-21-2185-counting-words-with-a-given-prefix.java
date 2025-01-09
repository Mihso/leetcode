class Solution {
    public int prefixCount(String[] words, String pref) {
        int counter = 0;

        for(String word: words){
            if(word.length() >= pref.length() && pref.equals(word.substring(0, pref.length()))){
                counter += 1;
            }
        }
        return counter;

    }
}