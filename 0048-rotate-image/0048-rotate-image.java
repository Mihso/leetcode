class Solution {
    public void rotate(int[][] matrix) {
        for(int x = 0; x < matrix.length; x++){
            for(int y = 0; y < x; y++){
                int value = matrix[x][y];
                matrix[x][y] = matrix[y][x];
                matrix[y][x] = value;
            }
        }
        for(int x = 0; x < matrix.length; x++){
            for(int y = 0; y < matrix[x].length / 2; y++){
                int value = matrix[x][y];
                matrix[x][y] = matrix[x][matrix.length - 1 - y];
                matrix[x][matrix.length - 1 - y] = value;
            }
        }
    }
}