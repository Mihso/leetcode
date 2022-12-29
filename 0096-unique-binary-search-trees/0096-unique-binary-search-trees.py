class Solution(object):
    def numTrees(self, n):
        """
        :type n: int
        :rtype: int
        """
        denom = 1
        num = 1
        
        for val in range(1, (2*n)+1):
            denom *= val
        for val in range(1,(n+1)+1):
            num *= val
        for val in range(1,n+1):
            num *= val
        print(denom, num)
        return(denom/num)
            