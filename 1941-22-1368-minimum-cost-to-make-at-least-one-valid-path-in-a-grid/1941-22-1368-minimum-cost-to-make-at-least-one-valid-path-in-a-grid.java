class Solution {
    public int minCost(int[][] grid) {
        Queue<int[]> paths = new LinkedList<>();
        int[][] copy = new int[grid.length][grid[0].length];
        for(int[] i: copy){
            Arrays.fill(i, Integer.MAX_VALUE);
        }
        paths.add(new int[]{0,0,0});
        int cost = Integer.MAX_VALUE;
        int[][] directions = new int[][]{new int[]{0,1, 1}, new int[]{0,-1, 2}, new int[]{1,0, 3},new int[]{-1,0, 4}};
        while(paths.size() > 0){
            int[] current = paths.poll();
            if(current[0] >= grid.length - 1 && current[1] >= grid[0].length - 1){
                cost = Math.min(current[2], cost);
                if(cost == 0){
                    return 0;
                }
            }
            for(int[] d: directions){
                int row = current[0] + d[0];
                int col = current[1] + d[1];
                if(row >= 0 && col >= 0 && row < grid.length && col < grid[0].length){
                    if(copy[row][col] > current[2]){
                        if(d[2] == grid[current[0]][current[1]]){
                            paths.add(new int[]{row, col, current[2]});
                            copy[row][col] = current[2];
                        }
                        else if(copy[row][col] > current[2] + 1){
                            paths.add(new int[]{row, col, current[2] + 1});
                            copy[row][col] = current[2] + 1;
                        }
                    }
                }
            }
        }

        return cost;
    }
}