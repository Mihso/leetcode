class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char[][] matrix = new char[box[0].length][box.length];
        for(int x = 0; x < box.length; x++){
            for(int y = 0; y < box[x].length; y++){
                matrix[y][x] = box[box.length - x - 1][y];
            }
        }
        for(char[] c: matrix){
            System.out.println(Arrays.toString(c));
        }
        for(int x = 0; x < matrix[0].length; x++){
            boolean swapped = true;
            while(swapped){
                swapped = false;
                for(int y = 0; y < matrix.length - 1; y++){
                    if(matrix[y][x] == '#' && matrix[y + 1][x] == '.'){
                        char store = matrix[y][x];
                        matrix[y][x] = matrix[y + 1][x];
                        matrix[y+1][x] = store;
                        swapped = true;
                    }
                }
            }
        }
        
        return matrix;
    }
}