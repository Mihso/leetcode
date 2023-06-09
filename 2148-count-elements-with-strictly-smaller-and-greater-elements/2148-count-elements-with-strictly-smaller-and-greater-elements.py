class Solution(object):
    def countElements(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        count = 0
        for n in range(1, len(nums)-1):
            if nums[n] > nums[0] and nums[n]< nums[len(nums)-1]:
                count +=1
        return count