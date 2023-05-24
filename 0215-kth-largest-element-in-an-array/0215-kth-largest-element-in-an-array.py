class Solution(object):
    def findKthLargest(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        print heapq.nlargest(k,nums)
        return heapq.nlargest(k, nums)[-1]