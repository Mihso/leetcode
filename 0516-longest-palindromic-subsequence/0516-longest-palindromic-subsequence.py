class Solution(object):
    def longestPalindromeSubseq(self, s):
        """
        :type s: str
        :rtype: int
        """
        diction = {}
        def palin(left, right):
            answer = 0
            if (left,right) in diction:
                return diction[(left,right)]
            if left == right:
                return 1
            if left > right:
                return 0
            if s[left] == s[right]:
                diction[(left,right)] = 2 + palin(left + 1, right - 1)
            else:
                diction[(left,right)] = max(palin(left + 1, right), palin(left, right - 1))
            return diction[(left,right)]
            
        
        result = palin(0,len(s)-1)
        
        return result