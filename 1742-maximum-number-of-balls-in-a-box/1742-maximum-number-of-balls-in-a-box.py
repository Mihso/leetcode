class Solution(object):
    def countBalls(self, lowLimit, highLimit):
        """
        :type lowLimit: int
        :type highLimit: int
        :rtype: int
        """
        box = {}
        
        for ball in range(lowLimit, highLimit + 1):
            split = str(ball)
            summer = 0
            for s in split:
                summer += int(s)
            if summer not in box:
                box[summer] = 0
            box[summer] += 1
        result = 0
        for b in box:
            result = max(result, box[b])
        return result