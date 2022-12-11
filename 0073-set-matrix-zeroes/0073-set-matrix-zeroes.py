class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        coord = []
        for col in range(len(matrix)):
            for row in range(len(matrix[col])):
                if matrix[col][row] == 0:
                    coord.append([col,row])
        
        for c in coord:
            for col in range(len(matrix)):
                matrix[col][c[1]] = 0
            for row in range(len(matrix[c[0]])):
                matrix[c[0]][row] = 0