class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        index = 0
        count = 0
        current = nums[0]
        for n in nums:
            if current != n:
                current = n
                count = 1
                nums[index] = n
                index += 1
                print(n,"changer")
            elif count < 2:
                nums[index] = n
                index += 1
                count += 1
                print(n,"counter")

        print(nums, index)       
        return index
            