class Solution(object):
    def combine(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        output = []
        def adder(lister, start):
            if len(lister) == k:
                output.append(list(lister))
            else:
                for q in range(start, n+1):
                    lister.append(q)
                    adder(lister, q+1)
                    lister.pop()
        adder([],1)
        return output