class Solution {
    public int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        Arrays.sort(copy);
        int answer = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != copy[i]){
                answer += 1;
            }
        }
        return answer;
    }
}