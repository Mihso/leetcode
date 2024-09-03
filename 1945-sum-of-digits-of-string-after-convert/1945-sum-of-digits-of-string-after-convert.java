class Solution {
    public int getLucky(String s, int k) {
        String answer = "";
        for(int i =0; i < s.length(); i++){
            answer += (s.charAt(i) - 96);
        }
        int answer2 = 0;
        for(int l = 0; l < k; l++){
            answer2 = 0;
            for(int i = 0; i < answer.length(); i++){
                answer2 += Character.getNumericValue(answer.charAt(i));
            }
            answer = Integer.toString(answer2);
        }
        
        return answer2;
    }
}