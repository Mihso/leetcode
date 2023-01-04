class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        result = []
        up = 0
        down = len(matrix) - 1
        left = 0
        right = len(matrix[0]) - 1
        while up <= down:
            for row in range(left, right + 1):
                result.append(matrix[up][row])
            up += 1
            if left <= right:
                for col in range(up, down + 1):
                    result.append(matrix[col][right])
                right -= 1
            if up <= down:
                for row in range(right, left -1, -1):
                    result.append(matrix[down][row])
                down -= 1
                if left <= right:
                    for col in range(down, up -1, -1):
                        result.append(matrix[col][left])
                    left += 1
        return result