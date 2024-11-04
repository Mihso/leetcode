class Solution {
    public String compressedString(String word) {
        String comp = "";
        int counter = 0;
        char current = word.charAt(0);
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != current || counter >= 9){
                comp += counter;
                comp += current;
                current= word.charAt(i);
                counter = 1;
            }
            else{
                counter += 1;
            }
        }
        
        comp += counter;
        comp += current;
        return comp;
    }
}