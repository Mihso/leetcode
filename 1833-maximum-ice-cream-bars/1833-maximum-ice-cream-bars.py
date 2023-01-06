class Solution(object):
    def maxIceCream(self, costs, coins):
        """
        :type costs: List[int]
        :type coins: int
        :rtype: int
        """
        
        costs.sort()
        total = 0
        count = 0
        index = 0
        while total < coins and index < len(costs):
            total += costs[index]
            if total <= coins:
                count += 1
            index +=1
            
        return count