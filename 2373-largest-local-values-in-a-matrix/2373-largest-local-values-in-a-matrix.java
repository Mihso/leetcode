class Solution {
    public int[][] largestLocal(int[][] grid) {
        int lengther = grid.length;
        
        int[][] answer = new int[lengther-2][lengther-2];
        for(int x = 0; x < lengther-2; x++){
            for(int y = 0; y < lengther-2; y++){
                int maximum = 0;
                for(int a = -1; a< 2; a++){
                    for(int b = -1; b < 2; b++){
                        maximum = Math.max(grid[x+1 - a][y + 1-b], maximum);
                    }
                }
                
                answer[x][y] = maximum;
            }
        }
        return answer;
    }
    
}