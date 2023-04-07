class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = []
        def permute(lister, out):
            for l in lister:
                copyOut = list(out)
                copyOut.append(l)
                copy = list(lister)
                copy.remove(l)
                if copy:
                    permute(copy, copyOut)
                else:
                    result.append(copyOut)
        permute(nums,[])
        return result
            