class Solution(object):
    def countHillValley(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        if len(nums) == 1:
            return True
        rise = None
        for n in range(len(nums) - 1):
            if nums[n + 1] > nums[n] and rise == None:
                rise = True
            elif nums[n + 1] < nums[n] and rise == None:
                rise = False
            elif nums[n + 1] > nums[n] and rise == False:
                rise = True
                count += 1
            elif nums[n + 1] < nums[n] and rise == True:
                rise =False
                count += 1
        print count
        return count