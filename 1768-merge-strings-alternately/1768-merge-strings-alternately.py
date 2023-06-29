class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        i1 = 0
        i2 = 0
        final = ""
        while i1 < len(word1) and i2 < len(word2):
            final += word1[i1]+word2[i2]
            i1 +=1
            i2+=1
        
        return final + word1[i1:len(word1)] + word2[i2:len(word2)]