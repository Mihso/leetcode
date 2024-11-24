class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long answer = 0;
        long negative = 0;
        long lowest = Integer.MAX_VALUE;
        for(int[] i: matrix){
            for(int num: i){
                if(num < 0){
                    negative += 1;
                }
                lowest = Math.min(lowest, Math.abs(num));
                answer += Math.abs(num);
            }
        }
        if(negative % 2 == 0){
            return answer;
        }
        else{
            return answer - (2*lowest);
        }
    }
}