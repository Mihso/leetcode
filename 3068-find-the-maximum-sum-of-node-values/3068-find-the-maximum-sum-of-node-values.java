class Solution {
    long[][] memo = new long[1][1];
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        memo = new long[nums.length][2];
        for(long[] l : memo){
            Arrays.fill(l, -1);
        }
        
        return helper(0, 1, nums, k);
        
//         long answer = 0;
//         while(change){
//             change = false;
            
//             for(int[] i: edges){
//                 int summer = nums[i[0]] + nums[i[1]];
                
//                 int compare = (nums[i[0]] ^ k) + (nums[i[1]] ^ k);
                
//                 if(summer < compare){
//                     nums[i[0]] = nums[i[0]] ^ k;
//                     nums[i[1]] = nums[i[1]] ^ k;
//                     change = true;
//                 }
                
//             }
//             long summy = 0;
//             for(int i: nums){
//                 summy += i;
//             }
//             answer = Math.max(answer, summy);
//         }
//         return answer;
    }
    
    public long helper(int index, int isEven, int[] nums, int k){
        if(index == nums.length){
            if(isEven == 1){
                return 0;
            }
            else{
                return Integer.MIN_VALUE;
            }
        }
        if(memo[index][isEven] != -1){
            return memo[index][isEven];
        }
        
        long noXor = nums[index] + helper(index + 1, isEven, nums, k);
        
        long Xor = (nums[index] ^ k) + helper(index +1, isEven ^ 1, nums, k);
        
        memo[index][isEven] = Math.max(noXor, Xor);
        return memo[index][isEven];
    }
}