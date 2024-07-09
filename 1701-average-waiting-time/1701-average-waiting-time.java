class Solution {
    public double averageWaitingTime(int[][] customers) {
        int end = 0;
        double answer = 0;
        
        for(int[] i : customers){
            end = Math.max(end, i[0]) + i[1];
            answer += end - i[0];
        }
        return answer/customers.length; 
        
    }
}