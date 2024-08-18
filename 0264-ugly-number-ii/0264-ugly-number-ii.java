class Solution {
    public int nthUglyNumber(int n) {
        Queue<Long> queuer = new PriorityQueue<>();
        queuer.add(1L);
        for(int i = 1; i < n; i++){
            long value = queuer.poll();
            if(!queuer.contains(value * 2)){
                queuer.add(value * 2);
            }
            if(!queuer.contains(value * 3)){
                queuer.add(value * 3);
            }
            if(!queuer.contains(value * 5)){
                queuer.add(value * 5);
            }
        }
        long answer = queuer.poll();
        return (int) answer;
        
    }
}