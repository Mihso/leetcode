class Solution(object):
    def maxPower(self, s):
        """
        :type s: str
        :rtype: int
        """
        current = s[0]
        count = 0
        result = 0
        for unit in s:
            if unit == current:
                count += 1
            else:
                result = max(result, count)
                current = unit
                count = 1
        result = max(result, count)
        return result