class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int index = 0;
        
        int[][] answer = new int[m][n];
        if(m * n != original.length){
            return new int[0][0];
        }
        for(int x  = 0; x < m; x++){
            for(int y = 0; y < n; y++){
                if(index < original.length){
                    answer[x][y] = original[index];
                    original[index] = -1;
                    index++;
                }
            }
        }
        
        return answer;
        
        
        
    }
}