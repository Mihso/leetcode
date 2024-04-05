class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int loopx = 0; loopx < 3; loopx++){
            for(int loopy = 0; loopy < 3; loopy++){
                List<Character> check = new ArrayList<>();
                for(int x = 0; x < 3; x++){
                    for(int y = 0; y < 3; y++){
                        char current = board[x+(loopx*3)][y+(loopy*3)];
                        if(Character.isDigit(current)){
                            if(!check.contains(current)){
                                check.add(current);
                            }
                            else{
                                return false;
                            }
                        }
                    }
                }
            }
        }
        
        for(int x = 0; x<9; x++){
            List<Character> check = new ArrayList<>();
            for(int y = 0; y < 9; y++){
                    char current = board[x][y];
                    if(Character.isDigit(current)){
                        if(!check.contains(current)){
                            check.add(current);
                        }
                        else{
                            return false;
                        }
                    }
            }
        }
        
        for(int y = 0; y<9; y++){
            List<Character> check = new ArrayList<>();
            for(int x = 0; x < 9; x++){
                    char current = board[x][y];
                    if(Character.isDigit(current)){
                        if(!check.contains(current)){
                            check.add(current);
                        }
                        else{
                            return false;
                        }
                    }
            }
        }
        
        return true;
    }
    
}