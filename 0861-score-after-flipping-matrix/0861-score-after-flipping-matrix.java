class Solution {
    public int matrixScore(int[][] grid) {
        for(int x = 0; x < grid.length; x++){
            if(grid[x][0] == 0){
                for(int a = 0; a < grid[x].length; a++){
                    if(grid[x][a] == 0){
                        grid[x][a] = 1;
                    }
                    else{
                        grid[x][a] = 0;
                    }
                }
            }
        }
        
        for(int y = 0; y < grid[0].length; y++){
            int counter = 0;
            for(int x = 0; x < grid.length; x++){
                if(grid[x][y] == 1){
                    counter++;
                }
            }
            
            if(counter <= grid.length/2){
                for(int x = 0; x < grid.length; x++){
                    if(grid[x][y] == 1){
                        grid[x][y] = 0;
                    }
                    else{
                        grid[x][y] = 1;
                    }
                }
            }
        }
        int summer = 0;
        for(int[] i: grid){
            String binary = "";
            for(int a: i){
                binary += a;
            }
            System.out.println(Arrays.toString(i));
            summer += Integer.parseInt(binary, 2);
        }
        
        return summer;
    }
}