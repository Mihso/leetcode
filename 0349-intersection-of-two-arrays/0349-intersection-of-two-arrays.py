class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        result = []
        
        if len(nums1) < len(nums2):
            for n in nums1:
                if n in nums2 and n not in result:
                    result.append(n)
        else:
            for n in nums1:
                if n in nums2 and n not in result:
                    result.append(n)
        return result