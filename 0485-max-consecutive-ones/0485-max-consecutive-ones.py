class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maximum = 0
        count = 0
        for n in nums:
            if n == 1:
                count += 1
            else:
                maximum = max(count, maximum)
                count = 0
        maximum = max(maximum, count)
        return maximum
        