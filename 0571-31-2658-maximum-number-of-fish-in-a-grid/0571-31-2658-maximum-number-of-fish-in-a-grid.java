class Solution {
    public int findMaxFish(int[][] grid) {
        int answer = 0;
        for(int x = 0; x< grid.length; x++){
            for(int y = 0; y < grid[0].length; y++){
                if(grid[x][y] != 0){
                    answer = Math.max(answer, fish(grid, x, y));
                }
            }
        }
        return answer;
    }
    private int fish(int[][] grid, int x, int y){
        int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        int summer = 0;
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            summer += grid[current[0]][current[1]];
            grid[current[0]][current[1]] = 0;
            for(int[] d: directions){
                int row = d[0] + current[0];
                int col = d[1] + current[1];

                if(row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] != 0){
                    queue.add(new int[]{row, col});
                }
            }
        }
        return summer;
    }
}