class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        index = 0
        nums.sort()
        if len(nums) == 0:
            return 0
        while index < len(nums) -1:
            if nums[index] == nums[index + 1]:
                del nums[index]
            else:
                index += 1
        print nums
        result = 0
        count = 1
        for n in range(len(nums)-1):
            if nums[n] + 1 != nums[n+1]:
                if count > result:
                    result= count
                count = 1
            else:
                count += 1
        if count > result:
            result= count
        return result