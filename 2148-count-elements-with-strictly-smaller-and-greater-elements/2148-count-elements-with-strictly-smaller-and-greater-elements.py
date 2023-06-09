class Solution(object):
    def countElements(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        for n in nums:
            if n > min(nums) and n < max(nums):
                count +=1
        return count