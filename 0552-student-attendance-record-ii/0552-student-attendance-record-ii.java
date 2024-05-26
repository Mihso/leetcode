class Solution {
//     char[] possible = new char[] {'A','P','L'};
//     int counter = 0;
//     public int checkRecord(int n) {
//         counter = (int) Math.pow(3, n);
//         record(n,"", 0);
//         return counter;
//     }
    
//     public int record(int n, String s, int aCounter){
//         if(s.length() < n){         
//             for(char c: possible){
//                 s += c;
//                 boolean valid = true;
                
//                 if(c == 'A'){
//                     aCounter += 1;
//                 }
                
//                 if(s.contains("LLL") || aCounter >= 2){
//                     valid = false;
//                     counter -= 1;
//                 }
//                 if(valid){
//                     record(n, s, aCounter);
//                 }
//                 if(c == 'A'){
//                     aCounter -= 1;
//                 }
                
//                 s = s.substring(0,s.length()-1);
//             }
//         }
        
//     }
    
        private final int MOD = 1000000007;
    // Cache to store sub-problem results.
    private int[][][] memo;

    // Recursive function to return the count of combinations of length 'n' eligible for the award.
    private int eligibleCombinations(int n, int totalAbsences, int consecutiveLates) {
        // If the combination has become not eligible for the award,
        // then we will not count any combinations that can be made using it.
        if (totalAbsences >= 2 || consecutiveLates >= 3) {
            return 0;
        }
        // If we have generated a combination of length 'n' we will count it.
        if (n == 0) {
            return 1;
        }
        // If we have already seen this sub-problem earlier, we return the stored result.
        if (memo[n][totalAbsences][consecutiveLates] != -1) {
            return memo[n][totalAbsences][consecutiveLates];
        }

        int count = 0;
        // We choose 'P' for the current position.
        count = eligibleCombinations(n - 1, totalAbsences, 0) % MOD;
        // We choose 'A' for the current position.
        count = (count + eligibleCombinations(n - 1, totalAbsences + 1, 0)) % MOD;
        // We choose 'L' for the current position.
        count = (count + eligibleCombinations(n - 1, totalAbsences, consecutiveLates + 1)) % MOD;

        // Return and store the current sub-problem result in the cache.
        return memo[n][totalAbsences][consecutiveLates] = count;
    }

    public int checkRecord(int n) {
        // Initialize the cache.
        memo = new int[n + 1][2][3];
        for (int[][] array2D : memo) {
            for (int[] array1D : array2D) {
                Arrays.fill(array1D, -1);
            }
        }
        // Return count of combinations of length 'n' eligible for the award.
        return eligibleCombinations(n, 0, 0);
    }
    
}