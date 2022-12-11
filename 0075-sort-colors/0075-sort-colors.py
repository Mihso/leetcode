class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
        start = 0
        
        while start < len(nums)-1:
            for n in range(0, len(nums)-start - 1):
                if nums[n] > nums[n + 1]:
                    nums[n],nums[n+1] = nums[n+1], nums[n]
            start += 1