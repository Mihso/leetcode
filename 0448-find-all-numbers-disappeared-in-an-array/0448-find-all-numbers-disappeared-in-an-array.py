class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result = []
        
        check = set(nums)
        
        for n in range(1, len(nums)+1):
            if n not in check:
                result.append(n)
        return result