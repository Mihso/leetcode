class Solution(object):
    def findLucky(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        result = -1
        diction = {}
        for a in arr:
            if a not in diction:
                diction[a] = 1
            else:
                diction[a] +=1
        for d in diction:
            if diction[d] == d:
                result = max(result, d)
        return result
        