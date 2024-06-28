class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[] values = new long[n];
        
        Arrays.fill(values, 0);
        
        for(int[] i: roads){
            values[i[0]] += 1;
            values[i[1]] += 1;
        }
        
        long answer = 0;
        Arrays.sort(values);
        for(int i = 1; i <= n; i++){
            answer += values[i-1] * i;
        }
        
        return answer;
        
    }
}