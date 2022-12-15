class Solution(object):
    def powerfulIntegers(self, x, y, bound):
        """
        :type x: int
        :type y: int
        :type bound: int
        :rtype: List[int]
        """
        dictionx = set()
        dictiony = set()
        i = 0
        result = []
         
        copyx= x
        copyy= y
        
        while copyx <= bound or copyy <= bound:
            copyx = x**i
            copyy= y**i
            dictionx.add(copyx)
            dictiony.add(copyy)
            i += 1
                       
            if x == 1:
                copyx = bound + 1
            if y == 1:
                copyy = bound +1
            
            
        for unit in dictionx:
            for unity in dictiony:
                if unit + unity <= bound and unit + unity not in result:
                    result.append(unit+unity)
        return result