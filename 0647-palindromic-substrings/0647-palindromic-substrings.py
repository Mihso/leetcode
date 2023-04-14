class Solution(object):
    def countSubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
        diction = {}
        def counter(l, r):
            left= l
            right = r
            match = True
            if (l,r) not in diction:
                diction[(l,r)] = 1
                if l == r:
                    return 1
                if l > r:
                    return 0
                while left < right:
                    if s[left] != s[right]:
                        match = False
                        left = right
                    left += 1
                    right -= 1
                result = 0
                if match:
                    result += 1
                result += counter(l+1,r)
                result += counter(l,r-1)
                return result
            else:
                return 0
        return counter(0,len(s)-1)