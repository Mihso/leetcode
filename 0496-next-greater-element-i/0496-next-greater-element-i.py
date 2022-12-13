class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        result = []
        for n in nums1:
            index = nums2.index(n)
            outcome = -1
            while index < len(nums2):
                if nums2[index] > n:
                    outcome = nums2[index]
                    break
                index += 1
            result.append(outcome)
        return result