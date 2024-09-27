class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long answer = 0;
        for(int i = 0; i < k; i++){
            answer += Math.max(0,happiness[happiness.length - (i + 1)] - i);
        }
        return answer;
    }
}