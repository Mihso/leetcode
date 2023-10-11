class Solution {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        System.out.println(value);
        String copy = new String();
        for(int i=0; i < value.length(); i++){
            copy = value.charAt(i) + copy;
        }
        
        System.out.println(copy);
        
        if(value.equals(copy))
        {return true;}
        return false;
    }
}