class Solution(object):
    def largestOddNumber(self, num):
        """
        :type num: str
        :rtype: str
        """

        while len(num) > 0:
            if num[-1] in {'1','3','5','7','9'}:
                return num
            else:
                num = num[0:len(num)-1]
        
        return ""    
        