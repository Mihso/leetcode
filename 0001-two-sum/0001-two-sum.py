class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        for n in range(len(nums)):
            for s in range(n + 1, len(nums)):
                if nums[n] + nums[s] == target:
                    return [n, s]
            
        return [0, 0]