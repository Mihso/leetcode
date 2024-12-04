class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int index = 0;
        int length1 = str1.length();
        int length2 = str2.length();
        for(int i = 0; i < length1 && index < length2; ++i){
            if(str1.charAt(i) == str2.charAt(index) || (str1.charAt(i) + 1 == str2.charAt(index) || (str1.charAt(i) - 25 == str2.charAt(index)))){
                index++;
            }
        }
        return index == length2;
    }
}