class Solution {
    public long coloredCells(int n) {
        long answer = 1;
        for(int i = 0; i < n; i++){
            answer += i*4;
        }

        return answer;
    }
}