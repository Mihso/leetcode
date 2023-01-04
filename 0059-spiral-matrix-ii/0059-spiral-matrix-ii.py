class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        matrix = []
        for row in range(n):
            rower = []
            for col in range(n):
                rower.append(0)
            matrix.append(rower)
        left = 0
        right = n - 1
        up = 0
        down = n - 1
        counter = 1
        while counter <= n**2:
            for unit in range(left, right + 1):
                matrix[up][unit] = counter
                counter += 1
            up += 1
            for unit in range(up, down + 1):
                matrix[unit][right] = counter
                counter += 1
            right -= 1
            if up <= down:
                for unit in range(right, left -1, -1):
                    matrix[down][unit] = counter
                    counter += 1
                down -= 1
            if left <= right:
                for unit in range(down, up-1, -1 ):
                    matrix[unit][left] = counter
                    counter += 1
                left += 1
        return matrix