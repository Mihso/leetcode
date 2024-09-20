class Solution {
    public String shortestPalindrome(String s) {
        int left = 0;
        
        for(int right = s.length() -1; right >= 0; right--){
            if(s.charAt(left) == s.charAt(right)){
                left++;
            }
        }
        if(left == s.length()){
            return s;
        }
        
        String suffix = s.substring(left);
        System.out.println(suffix);
        String prefix = shortestPalindrome(s.substring(0, left));
        System.out.println(prefix);
        for(int i = 0; i < prefix.length(); i++){
            s = prefix.charAt(i) + s;
        }
        for(int i = 0; i < suffix.length(); i++){
            prefix = suffix.charAt(i) + prefix;
        }
        
        return prefix + suffix;
        
    }
}