class Solution {
    public int uniquePaths(int m, int n) {
        int[] row = new int[n];
        Arrays.fill(row, 1);
        for(int i = 1; i < m; i++){
            for(int x = 1; x < n; x++){
                row[x] += row[x - 1];
            }
        }
        
        return row[row.length - 1];
        
    }
}