class Solution {
    public int minSwaps(int[] nums) {
        return Math.min(minSwapsHelper(0, nums), minSwapsHelper(1, nums));
    }
    private int minSwapsHelper(int val, int[] data){
        int lengther = data.length;
        int[] rightSuffixSum = new int[lengther + 1];
        for(int i= lengther - 1 ; i >= 0; i--){
            rightSuffixSum[i] = rightSuffixSum[i + 1];
            if(data[i] == (val ^ 1)){
                rightSuffixSum[i]++;
            }
        }
        
        int totalSwaps = rightSuffixSum[0];
        int currentSwaps = 0;
        int minimumSwaps = totalSwaps - rightSuffixSum[lengther - totalSwaps];
        for(int i = 0; i < totalSwaps; i++){
            if(data[i] == (val^1)){
                currentSwaps++;
            }
            int remaining = totalSwaps - i- 1;
            int requiredSwaps = (i+1 - currentSwaps) + (remaining - rightSuffixSum[lengther - remaining]);
            minimumSwaps = Math.min(minimumSwaps, requiredSwaps);
            
        }
        return minimumSwaps;
    }
}