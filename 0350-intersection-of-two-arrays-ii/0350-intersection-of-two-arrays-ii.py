class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        set1 = {}
        set2 = {}
        result = []
        for n in nums1:
            if n not in set1:
                set1[n] = 1
            else:
                set1[n] += 1
        for n in nums2:
            if n not in set2:
                set2[n] = 1
            else:
                set2[n] += 1
        print set1
        print set2
        for n in set1:
            if n in set2:
                for unit in range(min(set1[n],set2[n])):
                    result.append(n)
        return result