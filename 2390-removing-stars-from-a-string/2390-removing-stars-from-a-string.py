class Solution(object):
    def removeStars(self, s):
        """
        :type s: str
        :rtype: str
        """
        
        index = 0
        
        splitter = []
        
        for unit in s:
            if unit == "*":
                if len(splitter) > 0:
                    del splitter[-1]
            else:
                splitter.append(unit)
        return "".join(splitter)