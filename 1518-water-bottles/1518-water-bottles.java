class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int answer = 0;
        int empty = 0;
        while(numBottles >= 1){
            answer += numBottles;
            empty += numBottles;
            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }
        
        return answer;
        
    }
}