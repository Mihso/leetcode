class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        final = []
        def combo(value):
            for c in candidates:
                copy = list(value)
                copy.append(c)
                copy.sort()
                if sum(copy) < target:
                    combo(copy)
                elif sum(copy) == target and copy not in final:
                    final.append(copy)
        combo([]);
        return final