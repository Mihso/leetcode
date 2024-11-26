class Solution {
    public int findChampion(int n, int[][] edges) {
        Map<Integer, List<Integer>> incoming = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        int champion = n;
        for(int i = 0; i < n; i++){
            incoming.put(i, new ArrayList<Integer>());
        }
        
        for(int[] i: edges){
            incoming.get(i[1]).add(i[0]);
        }
        
        for(int i: incoming.keySet()){
            if(incoming.get(i).size() == 0){
                queue.add(i);
            }
        }
        
        while(!queue.isEmpty()){
            int lengther = queue.size();
            for(int i = 0; i < lengther; i++){
                int current = queue.remove();
                visited.add(current);
                if(incoming.get(current).size() == 0 && champion == n){
                    champion = current;
                }
                else if(incoming.get(current).size() == 0){
                    return -1;
                }
                else{
                    for(int neighbor: incoming.get(current)){
                        if(!visited.contains(neighbor)){
                            queue.add(neighbor);
                        }
                    }
                }
            }
        }
        if(champion == n){
            return -1;
        }
        return champion;
        
    }
}