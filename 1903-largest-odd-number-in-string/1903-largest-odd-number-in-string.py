class Solution(object):
    def largestOddNumber(self, num):
        """
        :type num: str
        :rtype: str
        """
        num
        
        while len(num) > 0:
            if int(num[len(num)-1]) % 2 != 0:
                return num
            else:
                num = num[0:len(num)-1]
        
        return ""    
        