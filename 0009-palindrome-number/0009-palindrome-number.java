class Solution {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        for(int i=0; i < value.length()/2; i++){
            if(value.charAt(i) != value.charAt(value.length() - 1 - i))
            {
                return false;
            }
        }
        return true;
    }
}