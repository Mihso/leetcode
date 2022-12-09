# The guess API is already defined for you.
# @param num, your guess
# @return -1 if num is higher than the picked number
#          1 if num is lower than the picked number
#          otherwise return 0
# def guess(num):

class Solution(object):
    def guessNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        checker = guess(n)
        mult = 1
        while checker != 0:
            n += checker* mult
            if checker == guess(n):
                mult += 1
            else:
                mult = 1
                
            checker = (guess(n))
        return n
        