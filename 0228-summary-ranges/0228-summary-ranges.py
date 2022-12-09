class Solution(object):
    def summaryRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        
        result = []
        start = 0
        end = 0
        for n in range(0,len(nums)):
            if nums[n] + 1 in nums:
                end = n + 1
            else:
                if start == end:
                    result.append(str(nums[start]))
                else:
                    result.append(str(nums[start]) + "->" + str(nums[end]))
                start = n + 1
                end = start
        return result
            