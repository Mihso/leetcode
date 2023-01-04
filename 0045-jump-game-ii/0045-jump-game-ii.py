class Solution(object):
    def jump(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        diction = {}
        def leap(index):
            if index not in diction:
                if index >= len(nums) -1:
                    return 0
                step = float('inf')
                for i in range(1, nums[index] + 1):
                    step = min(step, leap(index + i))
                diction[index] = 1 + step
                return 1 + step
            else:
                return diction[index]
        return leap(0)
                