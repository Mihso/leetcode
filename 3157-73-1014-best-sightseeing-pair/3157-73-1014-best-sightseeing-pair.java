class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int answer = Integer.MIN_VALUE;
        int bestSpotI = 0;
        for(int i = 0; i < values.length; i++){
            answer = Math.max(answer, bestSpotI + values[i] - i);
            if( bestSpotI< values[i] + i){
                bestSpotI = values[i] + i;
            }
        }
        
        return answer;
    }
}