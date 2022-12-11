class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        nums.sort()
        
        index = 0
        result = 0
        while index < len(nums):
            copy = nums[index: index + 2]
            result += min(copy)
            index += 2
        return result
        