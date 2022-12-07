class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        
        diction = {}
        for unit in s:
            if unit not in diction:
                diction[unit] = 1
            else:
                diction[unit] += 1
        for unti in t:
            if unti not in diction:
                return unti
            else:
                diction[unti] -= 1
                
                if diction[unti] < 0:
                    return unti
        
        