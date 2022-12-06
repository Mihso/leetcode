class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        
        indexer = 0
        
        for n in range(len(nums)):
            if nums[n] != val:
                nums[indexer] = nums[n]
                indexer += 1
                
        return indexer