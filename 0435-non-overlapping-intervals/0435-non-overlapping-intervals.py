class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: int
        """
        intervals.sort()
        prev = intervals[0]
        result = []
        for i in intervals:
            if prev[0] >= i[1] or prev[1] <= i[0]:
                result.append(prev)
                prev = i
            else:
                prev[0],prev[1] = max(prev[0],i[0]),min(prev[1],i[1])
        result.append(prev)
        return len(intervals) - len(result)