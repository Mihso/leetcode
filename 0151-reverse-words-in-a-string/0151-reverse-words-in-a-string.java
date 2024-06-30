class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        
        System.out.println(Arrays.toString(words));
        
        String answer = "";
        
        for(String x: words){
            if(x != ""){
            answer = x + " " + answer; 
        }}
        
        return answer.substring(0, answer.length() - 1);
    }
}