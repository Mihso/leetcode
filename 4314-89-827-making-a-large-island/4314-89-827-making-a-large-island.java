class Solution {
    public int largestIsland(int[][] grid) {
        Map<Integer, Integer> sizes = new HashMap<>();
        int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        int id = 2;
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[x].length; y++){
                if(grid[x][y] == 1){
                    sizes.put(id, sizer(grid, x, y, id));               
                    id += 1;
                }
            }
        }
        int answer = 0;
        for(int i: sizes.keySet()){
            answer = Math.max(answer, sizes.get(i));
        }
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[x].length; y++){
                if(grid[x][y] == 0){
                    Set<Integer> islands = new HashSet<>();
                    int value = 0;
                    for(int[] d: directions){
                        int row = x + d[0];
                        int col = y + d[1];

                        if(row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] != 0){
                            islands.add(grid[row][col]);
                        }   
                    }
                    for(int i: islands){
                        value += sizes.get(i);
                    }
                    answer = Math.max(answer, value + 1);
                }
            }
        }
        return answer;
    }
    private int sizer(int[][] grid,int x, int y, int id){
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        queue.add(new int[]{x,y});
        int counter = 0;
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            grid[current[0]][current[1]] = id;
            counter += 1;
            for(int[] d: directions){
                int row = current[0] + d[0];
                int col = current[1] + d[1];

                if(row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == 1){
                    queue.add(new int[]{row, col});
                    grid[row][col] = id;
                }
            }
        }

        return counter;

    }
}