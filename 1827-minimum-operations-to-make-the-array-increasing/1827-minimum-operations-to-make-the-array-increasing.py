class Solution(object):
    def minOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        for n in range(1,len(nums)):
            if nums[n-1] >= nums[n]:
                count += nums[n-1] - nums[n] + 1
                nums[n] = nums[n-1] + 1
        return count