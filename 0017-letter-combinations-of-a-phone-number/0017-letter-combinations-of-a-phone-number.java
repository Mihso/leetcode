class Solution {
    List<String> answer = new ArrayList<>();
    Map<Character,String> key = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() < 1){
            return answer;
        }
        key.put('2', "abc");
        key.put('3', "def");
        key.put('4', "ghi");
        key.put('5',"jkl");
        key.put('6',"mno");
        key.put('7',"pqrs");
        key.put('8',"tuv");
        key.put('9',"wxyz");
        thro("", 0, digits);
        return answer;
    }
    
    private void thro(String current, int index, String digits){
        if(index >= digits.length()){
            answer.add(current);
        }
        else{
            char curr = digits.charAt(index);
            String s = key.get(curr);
            for(int i = 0; i < s.length(); i++){
                String copy = current;
                copy+= s.charAt(i);
                thro(copy, index+1, digits);
            }
        }
        
        
    }
}