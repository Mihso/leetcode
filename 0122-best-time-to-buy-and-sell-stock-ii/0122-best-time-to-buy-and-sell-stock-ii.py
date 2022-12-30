class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        start = 0
        result = 0
        for n in range(1,len(prices)):
            if prices[n-1] > prices[n]:
                result += prices[n-1] - prices[start]
                start = n
            elif n == len(prices)-1:
                result += prices[n] - prices[start]
        return result
                