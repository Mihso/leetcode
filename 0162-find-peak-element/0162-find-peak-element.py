class Solution(object):
    def findPeakElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        left = 0
        right = len(nums) - 1
        if len(nums) == 1:
            return 0
        while left <= right:
            if left == 0:
                if nums[left] > nums[left +1]:
                    return left
            else:
                if nums[left] > nums[left - 1] and nums[left] > nums[left + 1]:
                    return left
            if right == len(nums)-1:
                if nums[right] > nums[right - 1]:
                    return right
            else:
                if nums[right] > nums[right - 1] and nums[right] > nums[right + 1]:
                    return right
            left += 1
            right -= 1
        return None