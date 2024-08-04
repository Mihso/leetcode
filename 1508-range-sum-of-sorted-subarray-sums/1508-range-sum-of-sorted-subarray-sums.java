class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> values = new ArrayList<>();
        for(int x = 0; x < nums.length; x++){
            int total = 0;
            for(int y = x ; y < nums.length; y++){
                total += nums[y];
                values.add(total);
            }
        }
        Collections.sort(values);
        
        int answer = 0;
        for(int x = left-1; x < right; x++){
            answer = (answer + values.get(x)) % ((int)1e9 + 7);
        }
        return answer;
        
    }
}