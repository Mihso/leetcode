class Solution(object):
    def findPoisonedDuration(self, timeSeries, duration):
        """
        :type timeSeries: List[int]
        :type duration: int
        :rtype: int
        """
        seconds = 0 
        
        if len(timeSeries) == 0:
            return 0
        
        for n in range(len(timeSeries)-1):
            seconds += min(timeSeries[n+1] - timeSeries[n], duration)
        return seconds + duration
            