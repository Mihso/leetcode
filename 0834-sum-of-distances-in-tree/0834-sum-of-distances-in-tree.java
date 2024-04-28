class Solution {
    int[] first;
    int[] answer;
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        Map<Integer, ArrayList<Integer>> mapper = new HashMap<>();
        for(int i = 0; i < n; i++){
            mapper.put(i, new ArrayList<Integer>());
        }
        
        for(int[] i: edges){
            mapper.get(i[0]).add(i[1]);
            mapper.get(i[1]).add(i[0]);
        }
        answer = new int[n];
        first = new int[n];
        distance(mapper, 0, 0, -1);
        dfs2(mapper, 0,0);
        
        return answer;
    }
    
    public void distance(Map<Integer, ArrayList<Integer>> guide, int current, int previous, int length){
        
        first[current] = 1;
        
        for(int next: guide.get(current)){
            if(next != previous){
                distance(guide, next, current, length + 1);
                first[current] += first[next];
                answer[current] += answer[next] + first[next];
            }
        }
        
    }
    public void dfs2(Map<Integer, ArrayList<Integer>> guide, int current, int previous) {
        for (int next : guide.get(current)) {
            if (next != previous) {
                answer[next] = answer[current] - first[next] + first.length - first[next];
                dfs2(guide,  next, current);
            }
        }
    }
}