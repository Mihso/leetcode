class Solution(object):
    def subsetsWithDup(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = [[]]
        def subber(lister):
            if lister and lister not in result:
                result.append(lister)
                for l in lister:
                    copy = list(lister)
                    copy.remove(l)
                    subber(copy)
        subber(nums)
        return result