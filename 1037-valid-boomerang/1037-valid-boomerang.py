class Solution(object):
    def isBoomerang(self, points):
        """
        :type points: List[List[int]]
        :rtype: bool
        """
        already = []
        for p in points:
            if p in already:
                return False
            already.append(p)
        diffX = points[0][0] - points[1][0]
        diffY = points[0][1] - points[1][1]
        slope = 0
        
        if diffY == 0:
            slope = float(90)
        else:
            slope = float(diffX) / float(diffY)
        diff2X = points[1][0] - points[2][0]
        diff2Y = points[1][1] - points[2][1]
        slope2 = 0
        if diff2Y == 0:
            slope2 = float(90)
        else:
            slope2 = float(diff2X) / float(diff2Y)
        print(slope, slope2)
        if slope2 != slope:
            return True
        return False