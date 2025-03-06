class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int twice = 0;
        Set<Integer> values = new HashSet<>();

        for(int i = 0; i < grid.length; i++){
            for(int y = 0; y < grid.length; y++){
                if(values.contains(grid[i][y])){
                    twice = grid[i][y];
                }
                else{
                    values.add(grid[i][y]);
                }
            }
        }

        int missing = 1;
        while(values.contains(missing)){
            missing += 1;
        }

        return new int[]{twice, missing};
    }
}