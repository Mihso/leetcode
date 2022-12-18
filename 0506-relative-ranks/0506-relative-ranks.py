class Solution(object):
    def findRelativeRanks(self, score):
        """
        :type score: List[int]
        :rtype: List[str]
        """
        result = [""] * len(score)
        for n in range(1,len(score) + 1):
            index = score.index(max(score))
            if n == 1:
                result[index] = "Gold Medal"
            elif n == 2:
                result[index] = "Silver Medal"
            elif n == 3:
                result[index] = "Bronze Medal"
            else:
                result[index] = str(n)
            score[index] = -1

        return result