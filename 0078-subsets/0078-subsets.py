class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        result = [[],nums]
        
        
        def combo(lister):
            for l in lister:
                copy = list(lister)
                copy.remove(l)
                copy.sort()
                if copy not in result:
                    result.append(copy)
                    combo(copy)
        combo(nums)
        return result