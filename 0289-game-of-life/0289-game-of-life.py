class Solution(object):
    def gameOfLife(self, board):
        """
        :type board: List[List[int]]
        :rtype: None Do not return anything, modify board in-place instead.
        """
        
        def checkCol(col):
            if col >= 0 and col <= len(board) -1 :
                return True
            return False
        def checkRow(row):
            if row >= 0 and row <= len(board[0]) - 1:
                return True
            return False
        
        def counter(col,row):
            count = 0
            for n in range(-1,2):
                if checkRow(row + n):
                    for m in range(-1,2):
                        if checkCol(col + m):
                            if board[col+m][row+n] != 0 and board[col + m][row+n] != "x":
                                if col + m != col or row+n != row:
                                    count += 1
            print count
            if board[col][row] == 1:
                if count ==0:
                    board[col][row] = 1
                else:
                    board[col][row] = count
            elif board[col][row] == 0 and count == 3:
                board[col][row] = "x"
            
        for n in range(len(board)):
            for m in range(len(board[n])):
                print(n,m)
                counter(n,m)
        print(board)
        for n in range(len(board)):
            for m in range(len(board[n])):
                if board[n][m] == "x":
                    board[n][m] = 1
                elif board[n][m] < 2 or board[n][m] > 3:
                    board[n][m] = 0
                else:
                    board[n][m] = 1
                    
        print board