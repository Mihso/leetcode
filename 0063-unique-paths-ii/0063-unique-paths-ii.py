class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """

        if obstacleGrid[0][0] == 1:
            return 0
        obstacleGrid[0][0] = 1
        
        for n in range(1, len(obstacleGrid[0])):
            if obstacleGrid[0][n] == 0:
                obstacleGrid[0][n] += obstacleGrid[0][n-1]
            else:
                obstacleGrid[0][n] = 0
        for n in range(1,len(obstacleGrid)):
            if obstacleGrid[n][0] == 0:
                obstacleGrid[n][0] += obstacleGrid[n-1][0]
            else:
                obstacleGrid[n][0] = 0
        for n in range(1, len(obstacleGrid)):
            for m in range(1, len(obstacleGrid[n])):
                if obstacleGrid[n][m] == 0:
                    obstacleGrid[n][m] = obstacleGrid[n-1][m] + obstacleGrid[n][m-1]
                else:
                    obstacleGrid[n][m] = 0
        return obstacleGrid[-1][-1]