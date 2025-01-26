class Solution {
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        boolean[] visited = new boolean[n];
        int[] indegrees = new int[n];
        for(int i = 0; i < n; ++i){
            int j = favorite[i];
            ++indegrees[j];
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(indegrees[i] == 0){
                visited[i] = true;
                queue.offer(i);
            }
        }
        int[] dp = new int[n];
        while(!queue.isEmpty()){
            int i = queue.poll();
            int j = favorite[i];
            dp[j] = Math.max(dp[j], dp[i] + 1);
            if(--indegrees[j] == 0){
                visited[j] = true;
                queue.offer(j);
            }
        }
        int result = 0; 
        int result2 = 0; 
        for(int i = 0; i < n; ++i) {
            if (visited[i] == false) {
                int length = 0;
                for(int j = i; visited[j] == false; j = favorite[j]) {
                    visited[j] = true;
                    ++length;
                }
                if (length == 2) {
                    result2 += 2 + dp[i] + dp[favorite[i]];
                } else {
                    result = Math.max(result, length);
                }
            }
        }
        return Math.max(result, result2);
        }
    }