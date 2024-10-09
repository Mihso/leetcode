class Solution {
    public int minAddToMakeValid(String s) {
        int counter = 0;
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                counter++;
            }
            else if(s.charAt(i) == ')'){
                counter--;
            }
            
            if(counter < 0){
                counter = 0;
                answer++;
            }
        }
        
        return answer + counter;
    }
}