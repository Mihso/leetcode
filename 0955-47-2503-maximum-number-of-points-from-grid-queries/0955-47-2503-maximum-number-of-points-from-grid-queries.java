class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        for(int i = 0; i < queries.length; i++){
            if(!map.containsKey(queries[i])){
                map.put(queries[i], new LinkedList<Integer>());
            }
            map.get(queries[i]).add(i);
        }
        Arrays.sort(queries);
        int[] answer = new int[queries.length];
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][] directions = new int[][]{{1,0}, {0,1}, {-1, 0}, {0, -1}};
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> grid[a[0]][a[1]]));
        queue.add(new int[]{0,0});
        int count = 0;
        for(int i: queries){
            while(!queue.isEmpty() && grid[queue.peek()[0]][queue.peek()[1]] < i){
                int[] current = queue.poll();
                if(grid[current[0]][current[1]] < i){
                    visited[current[0]][current[1]] = true;
                    count += 1;
                    for(int[] d: directions){
                        int row = current[0] + d[0];
                        int col = current[1] + d[1];

                        if(row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && !visited[row][col]){
                            visited[row][col] = true;
                            queue.offer(new int[]{row, col});

                        }
                    }
                }
            }
            while(!map.get(i).isEmpty()){
                answer[map.get(i).poll()] = count;
            }
        }
        return answer;
    }
}