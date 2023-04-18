class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        index1 = 0
        index2 = 0
        result = ""
        while index1 < len(word1) and index2 < len(word2):
            result += word1[index1]
            index1 += 1
            result += word2[index2]
            index2 += 1
        if index1 < len(word1):
            result += word1[index1:len(word1)]
        elif index2 < len(word2):
            result += word2[index2:len(word2)]
        return result