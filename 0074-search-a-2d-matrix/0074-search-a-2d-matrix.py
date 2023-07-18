class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        for r in range(len(matrix)):
            if matrix[r][0] > target:
                return False
            for c in range(len(matrix[r])):
                if matrix[r][c] == target:
                    return True
        return False