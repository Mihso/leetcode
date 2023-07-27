class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        value = []
        nums.sort()
        
        done = set()
        for n in range(len(nums)):
            left = n+1
            right = len(nums) - 1
            while left < right:
                summer = nums[n] + nums[left] + nums[right]
                if summer < 0:
                    left +=1
                elif summer > 0:
                    right -=1
                else:
                    if (nums[n],nums[left],nums[right]) not in done:
                        value.append([nums[n], nums[left],nums[right]])
                        done.add((nums[n],nums[left],nums[right]))
                    left +=1
        
        return value