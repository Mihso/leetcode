class Solution {
    public long mostPoints(int[][] questions) {
        Map<Integer, Long> solved = new HashMap<>();
        return solver(questions, 0, solved);
    }
    private long solver(int[][] questions, int current, Map<Integer, Long> solved){
        if(current > questions.length - 1){
            return 0;
        }
        if(solved.containsKey(current)){
            return solved.get(current);
        }
        else{
            int[] values = questions[current];
            long maxi = Math.max(solver(questions, current + values[1] + 1, solved) + values[0], solver(questions, current + 1, solved));
            solved.put(current, maxi);
            return maxi;
        }
    }
}