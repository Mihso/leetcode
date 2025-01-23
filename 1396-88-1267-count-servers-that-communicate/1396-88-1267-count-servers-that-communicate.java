class Solution {
    public int countServers(int[][] grid) {
        int answer = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] valid = new boolean[rows][cols];
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();

        for(int x = 0; x < rows; x++){
            for(int y = 0; y < cols; y++){
                if(grid[x][y] == 1){
                    row.put(x, row.getOrDefault(x, 0) + 1);
                    col.put(y, col.getOrDefault(y, 0) + 1);
                }
            }
        }

        for(int x = 0; x < rows; x++){
            for(int y = 0; y < cols; y++){
                if(grid[x][y] == 1){
                    if((row.get(x) > 1 || col.get(y) > 1) && !valid[x][y]){
                        valid[x][y] = true;
                        answer += 1;
                    }
                }
            }
        }
        return answer;

    }
}