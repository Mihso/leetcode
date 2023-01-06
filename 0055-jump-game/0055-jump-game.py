class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        index= len(nums) - 1
        for n in range(len(nums)-1,-1,-1):
            if index <= nums[n]+n:
                index = n
        return index <= 0
                 

