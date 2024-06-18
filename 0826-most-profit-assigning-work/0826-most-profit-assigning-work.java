class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[] out = new int[worker.length];
        
        for(int j = 0; j < worker.length; j++){
            out[j] = value(worker[j],difficulty, profit);
        }
        
        int answer = 0;
        for(int i: out){
            answer += i;
        }
        return answer;
    }
    
    private int value(int d, int[] difficulty, int[] profit){
        int answer = 0;
        for(int i = difficulty.length - 1; i >= 0; i--){
            if(difficulty[i] <= d){
                answer = Math.max(answer, profit[i]);
            }
        }
        return answer;
    }
}