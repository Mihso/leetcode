class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        Map<Integer, List<Integer>> mapper = new HashMap<>();
        for(int[] pre: prerequisites){
            if(!mapper.containsKey(pre[1])){
                mapper.put(pre[1], new ArrayList<Integer>());
            }
            mapper.get(pre[1]).add(pre[0]);
        }
        List<Boolean> answer = new ArrayList<>();
        for(int[] q: queries){
            Queue<Integer> queue = new LinkedList<>();
            queue.add(q[1]);
            Set<Integer> visited = new HashSet<>();
            visited.add(q[1]);
            boolean valid = false;
            while(!queue.isEmpty()){
                int current = queue.poll();
                if(current == q[0]){
                    valid = true;
                }
                if(mapper.containsKey(current)){
                    for(int i: mapper.get(current)){
                        if(!visited.contains(i)){
                            visited.add(i);
                            queue.add(i);
                        }
                    }
                }
            }
            answer.add(valid);
        }
        return answer;
    }
}