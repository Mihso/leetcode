class Solution {
    public String minRemoveToMakeValid(String s) {
        String[] letters = s.split("");
        int counter = 0;
        for(int i = 0; i < letters.length; i++){
            if(letters[i].equals("(")){
                counter += 1;
            }
            else if(letters[i].equals(")")){
                counter -= 1;
            }
            
            if(counter < 0){
                letters[i] = "";
                counter = 0;
            }
        }
        
        int i = letters.length - 1;
        while(counter > 0 && i >= 0){
            if(letters[i].equals("(")){
                letters[i] = "";
                counter -= 1;
            }
            i--;
        }
        
        String answer = new String();
        
        for(String unit: letters){
            answer += unit;
        }
        
        return answer;
    }
}