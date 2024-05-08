class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        for(int i = 0; i < answer.length; i ++){
            int maximum = 0;
            for(int y = 0; y < score.length; y++){
                if(score[maximum] < score[y]){
                    maximum = y;
                }
            }
            if(i == 0){
                answer[maximum] = "Gold Medal";
            }
            else if(i == 1){
                answer[maximum] = "Silver Medal";
            }
            else if(i == 2){
                answer[maximum] = "Bronze Medal";
            }
            else{
                answer[maximum] = Integer.toString(i+1);
            }
            
            score[maximum] = -1;
        }
        return answer;
    }
}