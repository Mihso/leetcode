class Solution {
    public int maxDistance(int[] position, int m) {
        int answer = 0;
        int n = position.length;
        Arrays.sort(position);
        int low = 1;
        int high = (int)Math.ceil(position[n-1] / (m-1));
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canPlaceBalls(mid, position, m)){
                answer = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return answer;
        
    }
    
    private boolean canPlaceBalls(int x, int[] position, int m){
        int prevBallPos = position[0];
        int ballsPlaced = 1;
        int i = 1;
        while(i < position.length && ballsPlaced < m){
       
            if(Math.abs(position[i] - prevBallPos) >= x){
                prevBallPos = position[i];
                ballsPlaced += 1;
            }
            
                 ++i;
        }
        
        return ballsPlaced == m;
        
    }
}