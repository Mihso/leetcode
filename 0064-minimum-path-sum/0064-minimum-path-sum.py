class Solution(object):
    def minPathSum(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        for row in range(len(grid)):
            for col in range(len(grid[row])):
                candidates = set()
                if row == 0 and col == 0:
                    continue
                if row > 0:
                    candidates.add(grid[row - 1][col])
                if col > 0:
                    candidates.add(grid[row][col-1])
                grid[row][col] += min(candidates)
        return grid[-1][-1]