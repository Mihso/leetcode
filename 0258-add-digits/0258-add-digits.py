class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        stringer = str(num)
        while len(stringer) > 1:
            newer = 0
            for unit in stringer:
                newer += int(unit)
            stringer = str(newer)
        return int(stringer)