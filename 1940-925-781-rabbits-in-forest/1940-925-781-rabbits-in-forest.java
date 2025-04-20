class Solution {
    public int numRabbits(int[] answers) {
        int answer = 0;
        Map<Integer, Integer> mapper = new HashMap<>();
        for(int i: answers){
            mapper.put(i, mapper.getOrDefault(i, 0) + 1);
        }

        for(int i: mapper.keySet()){
            int v = mapper.get(i);
            int size = i + 1;
            int groups = (i + v) / size;
            answer += groups * size;
        }
        return answer;
    }
}