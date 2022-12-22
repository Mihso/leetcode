class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        
        start = 0
        s = list(s)
        for unit in range(len(s)):
            if s[unit] == " ":
                left = start
                right = unit - 1
                while left <= right:
                    s[right], s[left] = s[left],s[right]
                    left +=1
                    right -= 1
                start = unit + 1
        left = start
        right = len(s) - 1
        while left <= right:
            s[right], s[left] = s[left],s[right]
            left += 1
            right -= 1
        return "".join(s)