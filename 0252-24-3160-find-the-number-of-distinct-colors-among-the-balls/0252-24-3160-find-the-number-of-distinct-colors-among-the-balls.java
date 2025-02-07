class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> balls = new HashMap<>();
        Map<Integer, Integer> color = new HashMap<>();
        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int[] q = queries[i];
            if(!balls.containsKey(q[0])){
                balls.put(q[0], 0);
            }
            if(balls.get(q[0]) != 0){
                color.put(balls.get(q[0]), color.get(balls.get(q[0])) - 1);
                if(color.get(balls.get(q[0])) == 0){
                    color.remove(balls.get(q[0]));
                }
            }
            balls.put(q[0], q[1]);
            if(!color.containsKey(q[1])){
                color.put(q[1], 0);
            }
            color.put(q[1], color.get(q[1]) + 1);
            answer[i] = color.size();
        }
        return answer;
    }
}