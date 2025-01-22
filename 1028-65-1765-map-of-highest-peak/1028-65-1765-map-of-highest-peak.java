class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int rows = isWater.length;
        int cols = isWater[0].length;
        int[][] heights = new int[rows][cols];
        for(int[] row: heights){
            Arrays.fill(row, rows + cols);
        }
        for(int x = 0; x < rows; x++){
            for(int y= 0; y < cols; y++){
                if(isWater[x][y] == 1){
                    heights[x][y] = 0;
                }
            }
        }

        int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for(int x = 0; x < rows; x++){
            for(int y = 0; y < cols; y++){
                if(x > 0){
                    heights[x][y] = Math.min(heights[x][y], heights[x-1][y] + 1);
                }
                if(y > 0){
                    heights[x][y] = Math.min(heights[x][y], heights[x][y - 1] + 1);
                }
            }
        }

        for(int x = rows - 1; x >= 0; x--){
            for(int y = cols - 1; y >= 0; y--){
                if(x < rows - 1){
                    heights[x][y] = Math.min(heights[x][y], heights[x+1][y] + 1);
                }
                if(y < cols - 1){
                    heights[x][y] = Math.min(heights[x][y], heights[x][y + 1] + 1);
                }
            }
        }

        return heights;
    }
}