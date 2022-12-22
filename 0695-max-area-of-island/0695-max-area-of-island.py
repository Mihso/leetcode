class Solution(object):
    def maxAreaOfIsland(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        check = {}
        result = 0
        def checker(x,y):
            count = 1
            grid[x][y] = 2
            if x > 0:
                if grid[x - 1][y] == 1:
                    count += checker(x-1,y)
            if x < len(grid) - 1:
                if grid[x + 1][y] == 1:
                    count += checker(x+1,y)
            if y > 0:
                if grid[x][y-1] == 1:
                    count += checker(x,y-1)
            if y < len(grid[x]) - 1:
                if grid[x][y+1] == 1:
                    count += checker(x,y+1)
            return count
        for x in range(len(grid)):
            for y in range(len(grid[x])):
                if grid[x][y] == 1:
                    val = checker(x,y)
                    result = max(result, val)
        return result