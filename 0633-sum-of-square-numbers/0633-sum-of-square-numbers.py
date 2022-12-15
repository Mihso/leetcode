class Solution(object):
    def judgeSquareSum(self, c):
        """
        :type c: int
        :rtype: bool
        """
        values = set()
        i = 0
        while i**2 <= c:
            values.add(i**2)
            i += 1
        print(values)
        for v in values:
            check = c - v
            if check in values:
                return True
        return False