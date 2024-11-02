class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] splitter = sentence.split(" ");
        for(int i = 0; i < splitter.length - 1; i++){
            if(splitter[i].charAt(splitter[i].length() - 1) != splitter[i + 1].charAt(0)){
                return false;
            }
        }
        String last = splitter[splitter.length  - 1];
        return splitter[0].charAt(0) == last.charAt(last.length() - 1);
    }
}