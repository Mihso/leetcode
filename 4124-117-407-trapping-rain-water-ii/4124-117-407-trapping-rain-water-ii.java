class Solution {
    public int trapRainWater(int[][] heightMap) {
        int n = heightMap.length;
        int m = heightMap[0].length;

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            visited[i][0] = true;
            visited[i][m - 1] = true;
            queue.offer(new int[]{heightMap[i][0], i, 0});
            queue.offer(new int[]{heightMap[i][m - 1], i, m - 1});
        }


        for (int i = 0; i < m; i++) {
            visited[0][i] = true;
            visited[n - 1][i] = true;
            queue.offer(new int[]{heightMap[0][i], 0, i});
            queue.offer(new int[]{heightMap[n - 1][i], n - 1, i});
        }

        int ans = 0;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, -1, 0, 1};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int h = curr[0], r = curr[1], c = curr[2];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc]) {
                    ans += Math.max(0, h - heightMap[nr][nc]);
                    queue.offer(new int[]{Math.max(h, heightMap[nr][nc]), nr, nc});
                    visited[nr][nc] = true;
                }
            }
        }

        return ans;
    }
}