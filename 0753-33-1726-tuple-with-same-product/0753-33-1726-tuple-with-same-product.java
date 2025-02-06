class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> values = new HashMap<>();

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                int mult = nums[i] * nums[j];
                if(!values.containsKey(mult)){
                    values.put(mult, 0);
                }
                values.put(mult, values.get(mult) + 1);
            }
        }
        int answer = 0;
        for(int i: values.keySet()){
            int tuples = values.get(i);
            if(tuples > 1){
                answer += ((tuples* (tuples- 1)) / 2) * 8;
            }
        }

        return answer;

    }
}