class Solution {
    public int islandPerimeter(int[][] grid) {
        int summer = 0;
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[x].length; y++){
                if(grid[x][y] == 1){
                    return checker(grid, x,y);
                }
            }
        }
        
        return 0;
    }
    
    public int checker(int[][] grid, int x, int y){
        Stack<int[]> land = new Stack<>();
        land.push(new int[]{x,y});
        int summer = 0;
        while(!land.isEmpty()){
            int[] current  = land.pop();
            if(current[0] < 0 || current[0] > grid.length - 1 || current[1] < 0 || current[1] > grid[0].length - 1){
                summer += 1;
            }
            else if(grid[current[0]][current[1]] == 0){
                summer += 1;
            }
            else if(grid[current[0]][current[1]]== 1){
                
                land.push(new int[]{current[0]-1,current[1]});
                land.push(new int[]{current[0]+1,current[1]});
                land.push(new int[]{current[0],current[1] + 1});
                land.push(new int[]{current[0],current[1] - 1});
                grid[current[0]][current[1]] = 2;
            }
        }
        return summer;
    }
}