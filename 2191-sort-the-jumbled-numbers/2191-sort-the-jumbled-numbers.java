class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, Integer> store = new HashMap<>();
        Integer[] numms = new Integer[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            numms[i] = nums[i];
        }
        
        for(int i = 0; i < nums.length; i++){
            String story = "";
            String value = Integer.toString(nums[i]);
            for(int x = 0; x < value.length(); x++){
                story += mapping[Character.getNumericValue(value.charAt(x))];
            }
            
            store.put(numms[i],Integer.parseInt(story));
        }
        
        Arrays.sort(numms, (a,b) -> {return store.get(a) - store.get(b);});
        
        for(int i =0; i< nums.length; i++){
            nums[i] = numms[i];
        }
        
        return nums;
        
    }
}