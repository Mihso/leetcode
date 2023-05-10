class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort()
        current = intervals[0]
        result = []
        for i in intervals:
            if current[1] >= i[0]:
                current = [min(i[0], current[0]), max(i[1], current[1])]
            else:
                result.append(current)
                current = i
        result.append(current)
        return result