class Solution {
    int[][] directions = new int[][]{{0,1},{1,0},{0, -1}, {-1,0}};
    public int minimumTime(int[][] grid) {
        if(grid[0][1] > 1 && grid[1][0] > 1){
            return -1;
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        boolean[][] paths = new boolean[grid.length][grid[0].length];
        queue.add(new int[]{grid[0][0], 0, 0});
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            if(current[1] == grid.length - 1 && current[2] == grid[0].length - 1){
                return current[0];
            }
            if(paths[current[1]][current[2]]){
                continue;
            }
            paths[current[1]][current[2]] = true;
            for(int[] d: directions){
                int newRow = current[1] + d[0];
                int newCol = current[2] + d[1];
                if(valid(grid, newRow, newCol)){
                    
                    int wait = ((grid[newRow][newCol] - current[0]) % 2 == 0) ? 1 : 0;
                    
                    int newTime = Math.max(grid[newRow][newCol] + wait,current[0] + 1);
                    queue.add(new int[]{newTime, newRow, newCol});
                }
            }
            
        }
        return -1;
    }
    private boolean valid(int[][] grid, int row, int col){
        return row >= 0 && col >= 0 && row < grid.length && col < grid[0].length;
    }
}