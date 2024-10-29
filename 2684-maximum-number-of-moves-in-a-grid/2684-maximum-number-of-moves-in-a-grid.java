class Solution {
    public int maxMoves(int[][] grid) {
        int counter = 0;
        int[][] dp = new int[grid.length][grid[0].length];
        
        for(int[] i: dp){
            Arrays.fill(i, -1);
        }
        
        for(int i = 0; i < grid.length; i++){
            counter = Math.max(counter, traverse(grid, dp, i, 0));
        }
        return counter;
    }
    
    private int traverse(int[][]grid, int[][] dp, int x, int y){
        
        if(y >= grid[0].length - 1){
            return 0;
        }
        
        if(dp[x][y] != -1){
            return dp[x][y];
        }
        
        int counter = 0;
        
        for(int i = -1; i <= 1; i++){
            if((x + i) >= 0 && (x + i) <= (grid.length - 1)){
                if(grid[x + i][y + 1] > grid[x][y]){
                    counter = Math.max(counter, 1 + traverse(grid,dp, x + i, y+ 1));
                }
            }
        }
        dp[x][y] = counter;
        return counter;
        
    }
}