class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        
        for(int x = 0; x < walls.length; x++){
            grid[walls[x][0]][walls[x][1]] = 2;
        }
        for(int x = 0; x < guards.length; x++){
            grid[guards[x][0]][guards[x][1]] = 3;
        }
        for(int x = 0; x < guards.length; x++){
            checker(grid, guards[x][0] - 1, guards[x][1], "north");
            checker(grid, guards[x][0]  + 1, guards[x][1], "south");
            checker(grid, guards[x][0], guards[x][1] + 1, "east");
            checker(grid, guards[x][0], guards[x][1] - 1, "west");
        }
        // for(int[] g : grid){
        //     System.out.println(Arrays.toString(g));
        // }
        int counter = 0;
        for(int[] row: grid){
            for(int i: row){
                if(i == 0){
                    counter += 1;
                }
            }
        }
        
        return counter;
        
    }
    
    private void checker(int[][] grid, int x , int y, String direction){
        if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length){
        if(grid[x][y] == 0 || grid[x][y] == -1){
            grid[x][y] = -1;
            int north = x - 1;
            int south = x + 1;
            int east = y + 1;
            int west = y - 1;
            if(north >= 0 && direction.equals("north")){
                checker(grid, north, y, "north");
            }
            if(south  < grid.length && direction.equals("south")){
                checker(grid, south, y, "south");
            }
            if(west >= 0 && direction.equals("west")){
                checker(grid, x, west, "west");
            }
            if(east < grid[x].length && direction.equals("east")){
                checker(grid, x, east, "east");
            }
        }
        }
    }
}