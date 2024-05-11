class Solution {
    public void rotate(int[][] matrix) {
        int lengther = matrix.length;
        for(int y = 0; y < matrix.length; y++){
            int top = 0;
            int bottom = lengther - 1;
            while(top < bottom){
                int store = matrix[top][y];
                
                matrix[top][y] = matrix[bottom][y];
                
                matrix[bottom][y] = store;
                
                top++;
                bottom--;
            }
        }
        int index = 0;
        while(index < lengther){
            for(int x = index; x < lengther; x++){
                int store = matrix[x][index];
                matrix[x][index] = matrix[index][x];
                matrix[index][x] = store;
            }
            
            index++;
        }
        
    }
}