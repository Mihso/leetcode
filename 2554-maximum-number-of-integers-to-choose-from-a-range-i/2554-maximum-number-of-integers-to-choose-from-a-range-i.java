class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int counter = 0;
        Arrays.sort(banned);
        int banIndex = 0;
        for(int i = 1; i <= n; i++){
            boolean skip = false;
            while(banIndex < banned.length && i == banned[banIndex]){
                banIndex += 1;
                skip = true;
            }
            if(!skip){
                maxSum -= i;
                if(0 > maxSum){
                    break;
                }
                counter += 1;
            }
        }
        return counter;
        
    }
}