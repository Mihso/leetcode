class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int x = 0;
        int y = 0;
        int maxX = matrix[0].length-1;
        int maxY = matrix.length-1;
        
        List<Integer> answer = new ArrayList<>();
        
        while(x <= maxX && y <= maxY){
            for(int i = x; i <= maxX; i++){
                answer.add(matrix[y][i]);
            }
            y += 1;
            for(int j = y; j <= maxY; j++){
                answer.add(matrix[j][maxX]);
            }
            maxX -= 1;
            if(y <= maxY){
                for(int i = maxX; i >= x; i--){
                    answer.add(matrix[maxY][i]);
                }
                maxY -= 1;
            }
            if(x <= maxX){
                for(int j = maxY; j >= y; j--){
                     answer.add(matrix[j][x]);
                }
            x += 1;
            }  
            
        }
        
        return answer;
        
    }
}