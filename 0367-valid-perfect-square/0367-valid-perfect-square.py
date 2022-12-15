class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        return(float(sqrt(num)) == int(sqrt(num)))