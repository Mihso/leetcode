class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        Map<Integer, Integer> tried = new HashMap<>();
        int values = 0;
        for(int x: nums1){
            if(!tried.containsKey(x)){
                int score = 0;
                for(int y: nums2){
                    score ^= x ^ y;
                }
                tried.put(x, score);
            }
            values ^= tried.get(x);
        }

        return values;
    }
}