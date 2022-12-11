class Solution(object):
    def minimumDifference(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        
        nums.sort()
        result = 10000000001
        
        for i in range(len(nums) - (k-1)):
            copy = nums[i:i + k]
            result = min(result, max(copy)-min(copy))
        return result
            
            
        
        