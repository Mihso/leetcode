class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> values = new HashMap<>();
        
        for(int i: nums){
            if(!values.containsKey(i)){
                values.put(i, 0);
            }
            values.put(i, values.get(i) + 1);
        }
        
        
        for(int i: values.keySet()){
            if(values.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}