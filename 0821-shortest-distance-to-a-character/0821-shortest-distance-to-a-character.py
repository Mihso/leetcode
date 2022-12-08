class Solution(object):
    def shortestToChar(self, s, c):
        """
        :type s: str
        :type c: str
        :rtype: List[int]
        """
        
        result = []
        
        charArr = []
        
        for unit in range(len(s)):
            if s[unit] == c:
                charArr.append(unit)
        print charArr
        
        for unit in range(len(s)):
            value = float('inf')
            
            for pos in charArr:
                value = min(value, abs(pos - unit))
            result.append(value)
        return result
        