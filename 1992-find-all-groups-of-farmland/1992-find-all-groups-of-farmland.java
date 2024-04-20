class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> coord = new ArrayList<>();
        for(int x = 0; x < land.length; x++){
            for(int y = 0; y <  land[x].length; y++){
                if(land[x][y] == 1){
                    coord.add(farm(land, x, y));
                }
            }
        }
        return coord.stream().toArray(int[][]:: new);
    }
    
    public int[] farm(int[][] land, int x, int y){
        if(land[x][y] == 1){
            int i = x;
            int j = y;
            while(i + 1 < land.length && land[i + 1][y] == 1){
                i++;
            }
            while(j+ 1 < land[0].length && land[x][j + 1] == 1){
                j++;
            }
            for(int a = x; a <= i; a++){
                for(int b = y; b <= j; b++){
                    land[a][b] = 2;
                }
            }
            return new int[]{x,y,i,j};
        }
        else{
            return null;
        }
    }
}