class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        string = list(str(x))
        print(string)
        original = list(str(x))
        string.reverse()
        if string == original:
            return True
        return False
        