class Solution(object):
    def checkPerfectNumber(self, num):
        """
        :type num: int
        :rtype: bool
        """
        den= num
        numer= 1
        
        result = 1
        if num <= 1:
            return False
        while den - 1 > numer:
            numer += 1
            den = num / numer
            if num % numer == 0:
                result += den + numer
                print(numer,den,result)
        if result == num:
            return True
        return False