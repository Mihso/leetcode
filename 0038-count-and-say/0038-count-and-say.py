class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        counter = n
        value = "1"
        while counter > 1:
            current = value[0]
            count = 0
            outcome = ""
            for unit in range(len(value)):
                if value[unit] != current:
                    outcome += str(count) + current
                    count = 1
                    current = value[unit]
                else:
                    count += 1
            outcome += str(count) + current
            count = 1
            value = outcome
            counter -= 1
        return value