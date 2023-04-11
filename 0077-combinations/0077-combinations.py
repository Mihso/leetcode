class Solution(object):
    def combine(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        result = []
        def checker(lister, output):
            prime = list(lister)
            while len(prime) > 0:
                copy = list(prime)
                copyOut = list(output)
                copyOut.append(prime[0])
                copy.remove(prime[0])
                prime.remove(prime[0])

                
                if len(copyOut) >= k:
                    result.append(copyOut)
                else:
                    checker(copy, copyOut)
        options = []
        
        for unit in range(1,n+1):
            options.append(unit)
        checker(options, [])
        return result