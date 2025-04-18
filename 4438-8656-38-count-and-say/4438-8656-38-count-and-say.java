class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        else{
            String value = "1";
            for(int i = 1; i < n; i++){
                value = RLE(value);
            }
            return value;
        }
    }

    private String RLE(String s){
        char current = s.charAt(0);
        int counter = 1;
        String answer = "";
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == current){
                counter += 1;
            }
            else{
                answer += Integer.toString(counter) + Character.toString(current);
                current = c;
                counter = 1;
            }
        }
        answer += Integer.toString(counter) + Character.toString(current);
        return answer;
    }
}