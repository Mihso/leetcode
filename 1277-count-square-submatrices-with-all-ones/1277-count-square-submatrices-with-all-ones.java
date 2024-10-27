class Solution {
    public int countSquares(int[][] matrix) {
        int[] row = new int[matrix[0].length];
        Arrays.fill(row, 0);
        int counter = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row[j] = 0;
                }
                else{
                    row[j] += 1;
                }
            }
            
            for(int x = 0; x < row.length; x++){
                int mini = row[x];
                for(int y = x; y < row.length; y++){
                    mini = Math.min(mini, row[y]);
                    if(mini >= y - x  + 1){
                        counter += 1;
                    }
                }
            }
            
        }
        
        return counter;
        
    }
}