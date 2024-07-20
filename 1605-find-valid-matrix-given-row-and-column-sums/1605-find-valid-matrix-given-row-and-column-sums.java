class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] matrix = new int[rowSum.length][colSum.length];
        
        int[] currRowSum = new int[rowSum.length];
        int[] currColSum = new int[colSum.length];
        
        
        for(int x = 0; x < rowSum.length; x++){
            for(int y= 0; y < colSum.length; y++){
                matrix[x][y] = Math.min(rowSum[x] - currRowSum[x], colSum[y]-currColSum[y]);
                currRowSum[x] += matrix[x][y];
                currColSum[y] += matrix[x][y];
            }
        }
        
        return matrix;
        
    }
}