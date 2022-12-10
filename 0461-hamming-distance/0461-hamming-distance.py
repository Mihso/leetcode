class Solution(object):
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        
        checkx = bin(x)[2:len(bin(x))]
        checky = bin(y)[2:len(bin(y))]
        
        while len(checkx)> len(checky):
            checky = "0"+checky
        while len(checky) > len(checkx):
            checkx = "0"+checkx
        print(checkx)
        print(checky)
        result = 0
        for n in range(len(checkx)):
            if checkx[n] != checky[n]:
                result += 1
        return result
            
        