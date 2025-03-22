class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> connections = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for(int i = 0; i < n; i++){
            connections.put(i, new ArrayList<Integer>());
        }
        for(int[] edge: edges){
            connections.get(edge[0]).add(edge[1]);
            connections.get(edge[1]).add(edge[0]);
        }
        int answer = 0;
        for(int i = 0; i < n; i++){
            if(!visited.contains(i) && connected(i, connections, visited)){
                answer += 1;
            }
        }
        return answer;
    }

    private boolean connected(int start, Map<Integer, List<Integer>> connections, Set<Integer> finalVisit){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        while(!queue.isEmpty()){
            int current = queue.poll();
            visited.add(current);
            List<Integer> neighbors = connections.get(current);
            for(Integer i: neighbors){
                if(!visited.contains(i)){
                    queue.add(i);
                    visited.add(i);
                }
            }
        }
        finalVisit.addAll(visited);
        for(Integer i: visited){
            if(connections.get(i).size() != visited.size() - 1){
                return false;
            }
        }

        return true;

    }
}