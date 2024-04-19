class Solution {
    public int numIslands(char[][] grid) {
        int answer = 0;
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[x].length; y++){
                if(grid[x][y] == '1'){
                    island(grid, x, y);
                    answer += 1;
                }
            }
        }
        
        return answer;
    }
    
    public void island(char[][] grid, int x, int y){
        if(grid[x][y] == '1')
        {
            grid[x][y] = '2';
            if(x  > 0){
                island(grid, x - 1, y);
            }
            if(x < grid.length - 1){
                island(grid, x + 1, y);
            }
            if(y > 0){
                island(grid, x, y - 1);
            }
            if(y < grid[0].length - 1){
                island(grid, x, y + 1);
            }
        }
    }
}