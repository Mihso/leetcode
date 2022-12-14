class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        firstrow = "qwertyuiop"
        secondrow = "asdfghjkl"
        thirdrow = "zxcvbnm"
        result = []
        for u in words:
            w = u.lower()
            adder = True
            if w[0] in firstrow:
                for unit in w:
                    if unit not in firstrow:
                        adder = False
                if adder == True:
                    result.append(u)
            if w[0] in secondrow:
                for unit in w:
                    if unit not in secondrow:
                        adder = False
                if adder == True:
                    result.append(u)
            if w[0] in thirdrow:
                for unit in w:
                    if unit not in thirdrow:
                        adder = False
                if adder == True:
                    result.append(u)
        return result