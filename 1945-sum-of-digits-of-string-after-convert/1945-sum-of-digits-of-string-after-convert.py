class Solution(object):
    def getLucky(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        
        converter = ""
        for unit in s:
            converter += str(ord(unit)-96)
        while k > 0:
            summer = 0
            for unit in converter:
                summer += int(unit)
            converter = str(summer)
            k -= 1
        return int(converter)