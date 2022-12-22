class Solution(object):
    def islandPerimeter(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        
        def check(x,y):
            count = 0
            if x > 0:
                if grid[x - 1][y] == 0:
                    count +=1
            else:
                count += 1
            if x < len(grid)-1:
                if grid[x + 1][y] == 0:
                    count += 1
            else:
                count += 1
            if y > 0:
                if grid[x][y-1] == 0:
                    count +=1
            else:
                count += 1
            if y < len(grid[x])-1:
                if grid[x][y + 1] == 0:
                    count += 1
            else:
                count += 1
            return count
        result = 0
        for x in range(len(grid)):
            for y in range(len(grid[x])):
                if grid[x][y] == 1:
                    result += check(x,y)
        return result
            
                