class Solution {
    public boolean canBeValid(String s, String locked) {
        Stack<Integer> openIndices = new Stack<>();
        Stack<Integer> unlockedIndices = new Stack<>();
        if(s.length() %2 != 0){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(locked.charAt(i) =='0'){
                unlockedIndices.push(i);
            }
            else if(s.charAt(i)=='('){
                openIndices.push(i);
            }
            else if(s.charAt(i) == ')'){
                if(!openIndices.isEmpty()){
                    openIndices.pop();
                }
                else if(!unlockedIndices.isEmpty()){
                    unlockedIndices.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!openIndices.isEmpty() && !unlockedIndices.isEmpty() && openIndices.peek() < unlockedIndices.peek()){
            openIndices.pop();
            unlockedIndices.pop();
        }
        if(openIndices.isEmpty() && !unlockedIndices.isEmpty()){
            return unlockedIndices.size() % 2 == 0;
        }
        return openIndices.isEmpty();
    }
}