class Solution {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        String copy = new String();
        for(int i=0; i < value.length(); i++){
            copy = value.charAt(i) + copy;
        }
        
        if(value.equals(copy))
        {return true;}
        return false;
    }
}