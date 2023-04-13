class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        diction = dict()
        
        for n in nums:
            if n not in diction:
                diction[n] = 1
            else:
                diction[n] += 1
                
        for d in diction:
            if diction[d] == 1:
                return d