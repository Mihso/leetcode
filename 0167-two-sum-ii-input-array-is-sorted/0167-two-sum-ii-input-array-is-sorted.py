class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        left = 0
        right = len(numbers) - 1
        
        while left <= right:
            value = numbers[left] + numbers[right]
            if value > target:
                right -= 1
            elif value < target:
                left +=1
            else:
                return [left+1,right+1]