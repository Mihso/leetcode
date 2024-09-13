class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            for(int y = queries[i][0]; y <= queries[i][1]; y++)
            answer[i] ^= arr[y];
        }
        
        return answer;
        
    }
}