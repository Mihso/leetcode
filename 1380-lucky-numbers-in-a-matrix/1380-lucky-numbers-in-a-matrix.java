class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        
        for(int x = 0; x < matrix.length; x++){
            int minimum = 0;
            for(int y = 0; y < matrix[x].length; y++){
                if(matrix[x][y] < matrix[x][minimum]){
                    minimum = y;
                }
                
            }
            int maximum = 0;
            for(int z = 0; z < matrix.length; z++){
                if(matrix[z][minimum] > matrix[maximum][minimum]){
                    maximum = z;
                }
            }
            
            if(matrix[x][minimum] == matrix[maximum][minimum] && !answer.contains(matrix[x][minimum])){
                answer.add(matrix[x][minimum]);
            }
                
        }
        
        return answer;
        
    }
}