class Solution(object):
    def findLHS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result = 0
        diction = {}
        for n in nums:
            if n not in diction:
                diction[n] = 1
            else:
                diction[n] +=1
        for d in diction:
            if d-1 in diction:
                    result = max(result,diction[d]+diction[d-1])
        return result
                