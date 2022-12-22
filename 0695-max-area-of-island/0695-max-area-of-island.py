class Solution(object):
    def maxAreaOfIsland(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        check = {}
        result = 0
        def checker(x,y):
            coord = str(x) + ":" + str(y)
            count = 0
            if coord not in check:
                count = 1
                check[coord] = 1
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
                if grid[x][y] == 1 and (str(x)+":"+ str(y)) not in check:
                    val = checker(x,y)
                    result = max(result, val)
        return result