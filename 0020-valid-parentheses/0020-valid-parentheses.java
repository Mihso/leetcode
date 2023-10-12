class Solution {
    public boolean isValid(String s) {
        Stack<Character> stacker = new Stack<Character>();
        
        if(s.length() == 0 || s.length()%2 != 0){
            return false;
        }
        
        for(int i = 0; i < s.length(); i++){
            Character current = s.charAt(i);
            if(current.equals(')'))
            {
                if(stacker.isEmpty()){
                    return false;
                }
                Character value = stacker.pop();
                if(!value.equals('(')){
                    return false;
                }
            }
            else if(current.equals('}'))
            {
                if(stacker.isEmpty()){
                    return false;
                }
                Character value = stacker.pop();
                if(!value.equals('{')){
                    return false;
                }
            }
            else if(current.equals(']'))
            {
                if(stacker.isEmpty()){
                    return false;
                }
                Character value = stacker.pop();
                if(!value.equals('[')){
                    return false;
                }
            }
            else{
                
                stacker.push(current);
                System.out.println(stacker);
            }
        }
        if(stacker.isEmpty()){
        return true;
        }
        else{
            return false;
        }
    }
}