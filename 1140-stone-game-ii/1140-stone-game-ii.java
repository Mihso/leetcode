class Solution {
    public int stoneGameII(int[] piles) {
        int length = piles.length;
        int[][] dp = new int[length + 1][length + 1];
        
        for(int[] a: dp){
            Arrays.fill(a, 0);
        }
        
        int[] suffixSum = new int[length + 1];
        Arrays.fill(suffixSum, 0);
        
        for(int i = length - 1; i >= 0; i--){
            suffixSum[i] = suffixSum[i +1] + piles[i];
        }
        
        for(int i= 0; i < length; i++){
            dp[i][length] = suffixSum[i];
        }
        
        for(int index = length - 1; index >= 0; index--){
            for(int maxi = length - 1; maxi >= 0; maxi--){
                for(int x = 1; x <= (2*maxi) && (index + x) <= length ; x++){
                    dp[index][maxi] = Math.max(dp[index][maxi], suffixSum[index] - dp[index + x][Math.max(maxi, x)]);
                }
            }
        }
        return dp[0][1];
    }
}