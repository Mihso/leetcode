class Solution(object):
    def largestOddNumber(self, num):
        """
        :type num: str
        :rtype: str
        """
        n = len(num)
        s = ""
        best_s = ""
        for i in range(n):
            s += num[i]

            if int(s[i])%2 != 0:
                best_s = s

        return best_s   
        