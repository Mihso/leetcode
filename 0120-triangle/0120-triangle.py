class Solution(object):
    def minimumTotal(self, triangle):
        """
        :type triangle: List[List[int]]
        :rtype: int
        """
        diction = {}
        def pather(row,previous,summer):
            result = triangle[row][previous]
            copy = summer + triangle[row][previous]
            if (str(row) + ":" + str(previous)) not in diction: 
                if row < len(triangle) - 1:
                    minimum = min(pather(row + 1, previous, copy), pather(row + 1, previous + 1, copy))
                    diction[str(row) + ":" + str(previous)] = minimum
                    result += minimum
            else:
                result += diction[str(row) + ":" + str(previous)]
            return result
        return(pather(0,0,0))
        