class Solution {
    public String clearDigits(String s) {
        StringBuilder stringer = new StringBuilder(s);

        int index = 0;
        while(index < stringer.length()){
            if(Character.isDigit(stringer.charAt(index))){
                if(index > 0){
                    stringer.deleteCharAt(index - 1);
                    stringer.deleteCharAt(index - 1);
                }
                else{
                    stringer.deleteCharAt(index);
                }
                index -= 1;
            }
            else{
                index += 1;
            }
        }
        return stringer.toString();
    }
}