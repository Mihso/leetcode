class Solution {
    
    
    // Directions for moving to neighboring cells: right, left, down, up
    final int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] mat = new int[n][n];
        Queue<int[]> multiSourceQueue = new LinkedList<>();

        // To make modifications and navigation easier, the grid is converted into a 2-d array.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    // Push thief coordinates to the queue
                    multiSourceQueue.add(new int[]{i, j});
                    // Mark thief cell with 0
                    mat[i][j] = 0;
                } else {
                    // Mark empty cell with -1
                    mat[i][j] = -1;
                }
            }
        }

        // Calculate safeness factor for each cell using BFS
        while (!multiSourceQueue.isEmpty()) {
            int size = multiSourceQueue.size();
            while (size-- > 0) {
                int[] curr = multiSourceQueue.poll();
                // Check neighboring cells
                for (int[] d : dir) {
                    int di = curr[0] + d[0];
                    int dj = curr[1] + d[1];
                    int val = mat[curr[0]][curr[1]];
                    // Check if the neighboring cell is valid and unvisited
                    if (isValidCell(mat, di, dj) && mat[di][dj] == -1) {
                        // Update safeness factor and push to the queue
                        mat[di][dj] = val + 1;
                        multiSourceQueue.add(new int[]{di, dj});
                    }
                }
            }
        }

        // Binary search for maximum safeness factor
        int start = 0;
        int end = 0;
        int res = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Set end as the maximum safeness factor possible
                end = Math.max(end, mat[i][j]);
            }
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValidSafeness(mat, mid)) {
                // Store valid safeness and search for larger ones 
                res = mid; 
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    // Check if a path exists with given minimum safeness value
    private boolean isValidSafeness(int[][] grid, int minSafeness) {
        int n = grid.length;

        // Check if the source and destination cells satisfy minimum safeness
        if (grid[0][0] < minSafeness || grid[n - 1][n - 1] < minSafeness) {
            return false;
        }

        Queue<int[]> traversalQueue = new LinkedList<>();
        traversalQueue.add(new int[]{0, 0});
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;

        // Breadth-first search to find a valid path
        while (!traversalQueue.isEmpty()) {
            int[] curr = traversalQueue.poll();
            if (curr[0] == n - 1 && curr[1] == n - 1) {
                return true; // Valid path found
            }
            // Check neighboring cells
            for (int[] d : dir) {
                int di = curr[0] + d[0];
                int dj = curr[1] + d[1];
                // Check if the neighboring cell is valid, unvisited and satisfying minimum safeness
                if (isValidCell(grid, di, dj) && !visited[di][dj] && grid[di][dj] >= minSafeness) {
                    visited[di][dj] = true;
                    traversalQueue.add(new int[]{di, dj});
                }
            }
        }

        return false; // No valid path found
    }

    // Check if a given cell lies within the grid
    private boolean isValidCell(int[][] mat, int i, int j) {
        int n = mat.length;
        return i >= 0 && j >= 0 && i < n && j < n;
    }
    
    
//     public int maximumSafenessFactor(List<List<Integer>> grid) {
        
//         List<int[]> thieves = new ArrayList<>();
        
//         for(int x = 0; x < grid.size(); x++ ){
//             for(int y = 0; y < grid.get(x).size(); y++){
//                 if(grid.get(x).get(y) == 1){
//                     thieves.add(new int[]{x,y});
//                 }
//             }
//         }
//         for(int[] i: thieves){
//         System.out.println(Arrays.toString(i));
//         }
//         if(grid.get(0).get(0) == 1){
//             return 0;
//         }
//         return maxi(grid, thieves, 0,0);
//     }
    
//     public int maxi(List<List<Integer>> grid, List<int[]> thief, int x, int y){
//         int maximum = Integer.MAX_VALUE;
        
//         grid.get(x).set(y, 2);
        
//         List<Integer> paths = new ArrayList<>();
        
//         for(int[] i: thief){
//             paths.add( Math.min(maximum, Math.abs(i[0]-x)+Math.abs(i[1] -y )));
//         }
        
//         if( x < grid.size() - 1 && grid.get(x + 1).get(y) == 0){
//             paths.add(Math.min(maximum, maxi( grid, thief, x + 1, y )));
//         }
        
//         if( y > 0 && grid.get(x).get(y - 1) == 0){
//             paths.add(Math.min(maximum, maxi( grid, thief, x, y -1)));
//         }
        
//         if( y < grid.get(x).size() - 1 && grid.get(x).get(y + 1) == 0){
//             paths.add(Math.min(maximum, maxi( grid, thief, x , y+1 )));
//         }
        
//         grid.get(x).set(y, 0);
//         int possible = 0;
//         for(int i: paths){
//             possible = Math.max(possible, i);
//         }
//         return possible;
//     }
    
}