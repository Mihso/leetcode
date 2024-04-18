class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[] checker = new int[obstacleGrid[0].length];
        Boolean found = false;
        for(int i = 0; i < obstacleGrid[0].length; i++){
            if(obstacleGrid[0][i] == 1 && !found){
                found = true;
                checker[i] = 0;
            }
            else if(!found){
                checker[i] = 1;
            }
            else{
                checker[i] = 0;
            }
        }
        
        for(int i = 1; i< obstacleGrid.length; i++){
            if(obstacleGrid[i][0] == 1){
                checker[0] = 0;
            }
            else{
                ;
            }
            for(int x = 1; x < obstacleGrid[i].length; x++){
                if(obstacleGrid[i][x] == 1){
                    checker[x] = 0;
                }
                else{
                    checker[x] += checker[x-1];
                }
            }
        }
        return checker[checker.length - 1];
        
    }
}