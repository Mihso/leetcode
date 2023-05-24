class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        new = set()
        
        for n in nums:
            if n not in new:
                new.add(n)
        if len(new) < 3:
            return max(new)
        return heapq.nlargest(3,new)[-1]