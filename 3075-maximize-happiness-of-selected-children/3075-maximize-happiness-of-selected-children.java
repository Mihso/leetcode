class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long answer = 0;
        
        Arrays.sort(happiness);
        
        for(int i = 0; i < k; i++){
            answer += Math.max(happiness[happiness.length - 1 - i] - i, 0);
        }
        
        return answer;
        
    }
}