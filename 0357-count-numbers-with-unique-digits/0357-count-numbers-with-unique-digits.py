class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        :type n: int
        :rtype: int
        """
        count = 1
        
        acum = 1
        
        for unit in range(n):
            count += acum*9 
            acum *= (10-unit-1)
        return count
        