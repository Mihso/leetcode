class Solution(object):
    def permuteUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        checked = set()
        result = []
        
        def permutate(lister, out):
            for l in lister:
                copyOut = list(out)
                copy = list(lister)
                copy.remove(l)
                copyOut.append(l)
                checker = ""
                for c in copyOut:
                    checker += str(c) + '+'
                if checker not in checked:
                    if copy:
                        permutate(copy, copyOut)
                    else:
                        result.append(copyOut)
                    checked.add(checker)
        permutate(nums, [])
        return result