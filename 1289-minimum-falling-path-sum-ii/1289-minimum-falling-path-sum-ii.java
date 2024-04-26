class Solution {
    public int minFallingPathSum(int[][] grid) {
        int len = grid[0].length;
        
        if(grid.length > 1){
        for(int start = grid.length - 2; start >= 0; start--){
            up(grid, start);
        }
        }
        
        int answer = grid[0][0];
        for(int i: grid[0]){
            answer = Math.min(answer, i);
        }
        
        return answer;
    }
    
    public void up(int[][] grid, int row){
        for(int x = 0; x < grid[row].length; x++){
            int mini = Integer.MAX_VALUE;
            for(int i = 0; i < grid[row].length; i++){
                if(i != x){
                    mini = Math.min(mini, grid[row + 1][i]);
                }
            }
            
            grid[row][x] += mini;
        }
    }
}
