class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int[] answer = new int[queries.length];
        int shortest = n;
        Map<Integer, List<Integer>> paths = new HashMap<>();
        for(int i = n - 1; i >= 0; i--){
            paths.put(i, new ArrayList<Integer>());
            if(i != n){
                paths.get(i).add(i + 1);
            }
        }
        
        for(int x = 0; x < queries.length; x++){
            paths.get(queries[x][0]).add(queries[x][1]);
            answer[x] = shortest(paths, n);
        }
        
        return answer;
        
    }
    
    private int shortest(Map<Integer, List<Integer>> map, int n){
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        int counter = 0;
        queue.add(0);
        while(!queue.isEmpty()){
            int lengther = queue.size();
            
            for(int i = 0; i < lengther; i++){
                int current = queue.remove();
                visited.add(current);
                if(current == n){
                    return counter - 1;
                }
                for(int value: map.get(current)){
                    if(!visited.contains(value)){
                        queue.add(value);
                    }
                }
            }
            counter++;
        }
        return counter;
    }
}