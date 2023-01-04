class Solution(object):
    def jump(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 1
        index = 0
        maxjp = nums[0]
        currentjp = nums[0]
        if len(nums) < 2:
            return 0
        while index < len(nums)-1:
            current = index
            maxjp = max(maxjp, nums[index] + index)
            if index == currentjp:
                count += 1
                currentjp = maxjp
            index += 1
        return count
                