class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder checker = new StringBuilder();
        checker.append(s);
        for(int i = 0; i < s.length(); i++){
            if(checker.toString().equals(goal)){
                return true;
            }
            
            char c = checker.charAt(0);
            checker.deleteCharAt(0);
            checker.append(c);
            
        }
        
        return false;
        
    }
}