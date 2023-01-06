class Solution(object):
    def maximumProduct(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        heapify(nums)
        while k > 0:
            heappush(nums, heappop(nums)+1) 
            k -= 1
        result = 1
        for n in nums:
            result *= n
            result %= 10**9 + 7
        return result
        