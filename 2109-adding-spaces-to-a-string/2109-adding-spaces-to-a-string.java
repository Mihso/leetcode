class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder answer = new StringBuilder(s);
        int counter  = 0;
        for(int i: spaces){
            answer.insert(i + counter, ' ');
            counter++;
        }
        
        return answer.toString();
        
    }
}