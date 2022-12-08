class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        diction = {}
        
        for unit in s:
            if unit not in diction:
                diction[unit] = 1
            else:
                diction[unit] += 1
               
        for unit in range(len(s)):
            if diction[s[unit]] == 1:
                return unit
        return -1
        