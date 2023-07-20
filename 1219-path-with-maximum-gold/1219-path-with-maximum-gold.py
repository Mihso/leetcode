class Solution(object):
    def getMaximumGold(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        checked = set()
        def pather(x,y):
            potential = [0]
            if grid[x][y] != 0:
                if x > 0 and (x-1,y) not in checked:
                    checked.add((x-1,y))
                    potential.append(pather(x-1,y))
                    checked.remove((x-1,y))
                if x < len(grid)-1 and (x+1,y) not in checked:
                    checked.add((x+1,y))
                    potential.append(pather(x+1,y))
                    checked.remove((x+1,y))
                if y > 0 and (x,y-1) not in checked:
                    checked.add((x,y-1))
                    potential.append(pather(x, y-1))
                    checked.remove((x,y-1))
                if y < len(grid[x]) - 1 and (x, y+1) not in checked:
                    checked.add((x, y+1))
                    potential.append(pather(x, y+1))
                    checked.remove((x,y+1))
            return grid[x][y] + max(potential)
        maxer = 0
        for x in range(len(grid)):
            for y in range(len(grid[x])):
                if grid[x][y] != 0:
                    checked.add((x,y))
                    value = pather(x,y)
                    maxer = max(maxer, value)
                    checked.remove((x,y))
        return maxer