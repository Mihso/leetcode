class Solution {
    public int getMaximumGold(int[][] grid) {
        int answer = 0;
        for(int x = 0; x< grid.length; x++){
            for(int y = 0; y < grid[x].length; y++){
                answer = Math.max(answer, gold(x,y,grid));
            }
        }
        
        return answer;
    }
    
    public int gold(int x, int y, int[][] grid){
        int value = grid[x][y];
        int answer = 0;
        grid[x][y] = 0;
        if(x > 0 && grid[x-1][y] != 0){
            answer = Math.max(answer, gold(x-1, y, grid));
        }
        if(x < grid.length - 1 && grid[x+1][y] != 0){
            answer = Math.max(answer, gold(x+1, y, grid));
        }
        
        if(y > 0 && grid[x][y-1] != 0){
            answer = Math.max(answer, gold(x, y-1, grid));
        }
        if(y < grid[0].length - 1 && grid[x][y+1] != 0){
            answer = Math.max(answer, gold(x, y+1, grid));
        }
        
        grid[x][y] = value;
        
        return value + answer;
        
    }
}