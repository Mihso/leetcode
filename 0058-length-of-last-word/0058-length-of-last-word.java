class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int index = words.length - 1;
        
        while(index >= 0){
            if(words[index].length() > 0){
                return words[index].length();
            }
            else{
                index -= 1;
            }
        }
        return 0;
    }
}