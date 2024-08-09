class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int counter = 0;
        for(int x = 0; x < grid.length - 2; x++){
            for(int y = 0; y < grid[x].length - 2; y++){
                if(magic(grid, x,y)){
                    counter++;
                }
            }
        }
        return counter;
    }
    private boolean magic(int[][] grid,int startX,int startY){
        Set<Integer> valid = new HashSet<>();
        for(int i = 1; i < 10; i++){
            valid.add(i);
        }
        Set<Integer> values = new HashSet<>();
        for(int x = 0; x < 3 ; x++){
            for(int y = 0; y < 3; y++){
                int current = grid[startX + x][startY + y];
                if(!values.contains(current) && valid.contains(current)){
                    values.add(current);
                }
                else{
                    return false;
                }
            }
        }
        int previous = 0;
        for(int y = 0; y < 3; y++){
            previous += grid[startX ][startY + y];
        }
        for(int x = 1; x < 3; x++){
            int store = 0;
            for(int y = 0; y < 3; y++){
                store += grid[startX +x][startY + y];
            }
            if(store != previous){
                return false;
            }
        }
        
        previous = 0;
        for(int x = 0; x < 3; x++){
            previous += grid[startX +x][startY];
        }
        for(int y = 1; y < 3; y++){
            int store = 0;
            for(int x = 0; x < 3; x++){
                store += grid[startX + x][startY + y];
            }
            if(store != previous){
                return false;
            }
        }
        int left = 0, right = 0;
        for(int i = 0; i < 3; i++){
            left += grid[startX+i][startY+i];
            right += grid[startX + i][startY + 2 - i];
        }
        
        if(left != right){
            return false;
        }
        
        
        return true;
    }
}