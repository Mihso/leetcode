class Solution {
    private final int[][] directions = {{0,1}, {0, - 1}, {1,0}, {-1,0}, };
    public int minimumObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] minObstacles = new int[m][n];
        for(int[] i: minObstacles){
            Arrays.fill(i, Integer.MAX_VALUE);
        }
        minObstacles[0][0] = grid[0][0];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        
        pq.add(new int[] {minObstacles[0][0], 0, 0});
        
        while(!pq.isEmpty()){
            int[] current = pq.poll();
            if(current[1] == m - 1 && current[2] == n - 1){
                return current[0];
            }
            for(int[] d: directions){
                int newRow = current[1] + d[0], newCol = current[2] + d[1];
                if(isValid(grid, newRow, newCol)){
                    int newObstacles = current[0] + grid[newRow][newCol];
                    if(newObstacles < minObstacles[newRow][newCol]){
                        minObstacles[newRow][newCol] = newObstacles;
                        pq.add(new int[] {newObstacles, newRow, newCol});
                    }
                }
            }
        }
        return minObstacles[m-1][n-1];
    }
    private Boolean isValid(int[][] grid, int row, int col){
        if(row < 0){
            return false;
        }
        if(row > grid.length - 1){
            return false;
        }
        if(col < 0){
            return false;
        }
        if(col > grid[0].length - 1){
            return false;
        }
        return true;
    }
}