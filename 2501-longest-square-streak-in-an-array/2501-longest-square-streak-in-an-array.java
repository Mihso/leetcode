class Solution {
    public int longestSquareStreak(int[] nums) {
        int counter = 0;
        Set<Integer> values = new HashSet<>();
        
        for(int i: nums){
            values.add(i);
        }
        
        for(int i : values){
            int start = i;
            int count = 0;
            while(values.contains(start)){
                count += 1;
                start = (int)Math.pow(start, 2);
            }
            counter = Math.max(counter, count);
        }
        if(counter < 2){
            return -1;
        }
        return counter;
    }
}