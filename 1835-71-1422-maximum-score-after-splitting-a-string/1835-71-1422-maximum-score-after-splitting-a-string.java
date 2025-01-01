class Solution {
    public int maxScore(String s) {
        int answer = 0;
        for(int i = 1; i < s.length(); i++){
            int counter = 0;
            for(int l = 0; l < i; l++){
                if(s.charAt(l) == '0'){
                    counter += 1;
                }
            }
            for(int r = i; r < s.length(); r++){
                if(s.charAt(r) == '1'){
                    counter += 1;
                }
            }
            answer = Math.max(answer, counter);
        }
        return answer;
    }
}