class Solution {
    public String reverseParentheses(String s) {
        List<Integer> starter = new ArrayList<>();
        String[] c = s.split("");
        for(int i = 0; i < s.length(); i++){
            if(c[i].equals("(")){
                starter.add(0, i);
            }
            else if(c[i].equals(")")){
                int start = starter.remove(0);
                reverser(c, start + 1, i - 1);
            }
        }
        String answer = "";
        for(String unit: c){
            if(!unit.equals(")") && !unit.equals("(")){
                answer += unit;
            }
        }
        
        return answer;
        
    }
    
    private void reverser(String[] c, int start, int end){
        
        while(start < end){
            
            String store = c[start];
            c[start]= c[end];
            c[end] = store;
            start++;
            end--;
        }
    }
}