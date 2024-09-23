class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mapper = new HashMap<>();
        List<Integer> order = new ArrayList<>();
        for(int i: nums){
            if(!mapper.containsKey(i)){
                mapper.put(i, 0);
            }
            mapper.put(i, mapper.get(i) + 1);
        }
        
        for(int i: mapper.keySet()){
            order.add(i);
        }
        
        Collections.sort(order, (a, b) -> {
            return mapper.get(b) - mapper.get(a);});
        
        int[] answer = new int[k];
        
        for(int i = 0; i < k; i++){
            answer[i] = order.get(i);
        }
        
        return answer;
        
    }
}