class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        else if(n <= 2){
            return 1;
        }
        
        List<Integer> values = new ArrayList<>();
        values.add(0);
        values.add(1);
        values.add(1);
        int cur = 3;
        while(cur <= n){
            int sizer = values.size();
            values.add(values.get(sizer - 1) + values.get(sizer-2) + values.get(sizer-3));
            cur += 1;
        }
        
        return values.get(values.size() - 1);
    }
}