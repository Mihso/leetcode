class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        result = []
        set1 = set(nums1)
        set2 = set(nums2)
        for n in set1:
            if n in set2:
                result.append(n)
        return result