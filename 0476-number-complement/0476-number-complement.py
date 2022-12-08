class Solution(object):
    def findComplement(self, num):
        """
        :type num: int
        :rtype: int
        """
        
        value = bin(num)[2:len(bin(num))]
        
        new = ""
        for s in value:
            if s == "0":
                new += "1"
            else:
                new += "0"
        new = "0b"+ new
        
        print(int(new,2))
        return int(new,2)
        