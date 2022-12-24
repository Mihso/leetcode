class Solution(object):
    def selfDividingNumbers(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: List[int]
        """
        result = []
        for n in range(left, right + 1):
            copy = list(str(n))
            insert = True
            if "0" not in copy:
                for c in copy:
                    if n % int(c) != 0:
                        insert = False
            else:
                insert = False
            if insert == True:
                result.append(n)
        return result
                    