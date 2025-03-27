class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> values = new HashMap<>();
        for(int i: nums){
            values.put(i, values.getOrDefault(i, 0) + 1);
        }
        int dominant = 0;
        int number = 0;
        for(int key: values.keySet()){
            if(values.get(key) > number){
                dominant = key;
                number = values.get(key);
            }
        }
        int index = 0;
        int number2 = 0;
        while(index < nums.size()){
            if(nums.get(index) == dominant){
                number2 += 1;
            }
            if((number - number2) * 2 > nums.size() - (index + 1) && number2 * 2 > (index + 1)){
                return index;
            }
            index += 1;
        }
        return -1;
    }
}