class Solution {
    public String makeGood(String s) {
        boolean found = true;
        
        while(found){
            found = false;
            int i = 0;
            while(i < s.length()-1){
                
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(i+1))){
                    if(!comp(s.charAt(i), s.charAt(i+1))){
                        s = s.substring(0, i) + s.substring(i+2);
                        found = true;
                    }
                    else{
                        i++;
                    }
                }
                else{
                    i++;
                }
            }
        }
        
        return s;
    }
    
    public boolean comp(char x, char y){
        if(Character.isLowerCase(x) && Character.isLowerCase(y)){
            return true;
        }
        else if(Character.isUpperCase(x) && Character.isUpperCase(y)){
            return true;
        }
        else{
            return false;
        }
    }
}