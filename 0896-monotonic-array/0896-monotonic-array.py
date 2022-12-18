class Solution(object):
    def isMonotonic(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        
        if len(nums) == 1:
            return True
        
        increase = True
        if nums[0] > nums[-1]:
            increase = False
            
        for n in range(len(nums)-1):
            if increase == True:
                if nums[n] > nums[n + 1]:
                    return False
            elif increase == False:
                if nums[n] < nums[n + 1]:
                    return False
        return True