class Solution(object):
    def findMinArrowShots(self, points):
        """
        :type points: List[List[int]]
        :rtype: int
        """
        result = []
        points.sort()
        prev = points[0]
        for p in points:
            if p[0] > prev[1] or p[1] < prev[0]:
                result.append(prev)
                prev = p
            else:
                prev[0] = max(prev[0],p[0])
                prev[1] = min(prev[1],p[1])
        result.append(prev)
        return len(result)
        