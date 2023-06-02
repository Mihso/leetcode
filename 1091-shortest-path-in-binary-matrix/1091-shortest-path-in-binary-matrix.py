class Solution(object):
    def shortestPathBinaryMatrix(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        if grid[0][0] != 0:
            return -1
        que = [[0,0]]
        grid[0][0] = 1
        def within(x,y):
            if x < 0 or x > len(grid) - 1:
                return False
            if y < 0 or y > len(grid[x]) -1:
                return False
            return True
        while que:
            current = que[0]
            if current[0] == len(grid)-1 and current[1] == len(grid[0])-1:
                return grid[current[0]][current[1]]
            value = grid[current[0]][current[1]]
            rows = [-1,0,1]
            col = [-1,0,1]
            for r in rows:
                for c in col:
                    if r == 0 and c == 0:
                        pass
                    elif not within(current[0] + r, current[1] + c):
                        pass
                    else:
                        if grid[current[0] + r][current[1]+c] == 0:
                            grid[current[0] + r][current[1]+c] = value + 1
                            que.append([current[0]+r,current[1]+c])
            que.pop(0)
        return -1