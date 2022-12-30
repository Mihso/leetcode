class Solution(object):
    def exist(self, board, word):
        """
        :type board: List[List[str]]
        :type word: str
        :rtype: bool
        """
        found = False
        
        def searcher(x,y,index):
            if index >= len(word) - 1:
                return True
            travel = [0]
            c1 = False
            c2 = False
            c3 = False
            c4 = False
            curr = board[x][y]
            board[x][y] = "#"
            if index < len(word)-1:
                if x > 0 and board[x - 1][y] == word[index + 1]:
                    c1 = searcher(x-1, y, index + 1)
                if x < len(board)-1 and board[x+1][y] == word[index + 1]:
                        c2 = searcher(x+1,y,index + 1)
                if y > 0 and board[x][y-1] == word[index + 1]:
                        c3 = searcher(x, y-1, index + 1)
                if y < len(board[x])-1 and board[x][y+1] == word[index + 1]:
                        c4 = searcher(x,y+1,index + 1)
            board[x][y] = curr
            return(c1 or c2 or c3 or c4)
        
        for x in range(len(board)):
            for y in range(len(board[x])):
                index = 0
                if found == False:
                    if board[x][y] == word[0]:
                        if searcher(x,y,0):
                            found = True
        return found