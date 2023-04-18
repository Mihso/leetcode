class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        index = 0
        result = ""
        while index < len(word1) and index < len(word2):
            result += word1[index]
            result += word2[index]
            index += 1
        if index < len(word1):
            result += word1[index:len(word1)]
        elif index < len(word2):
            result += word2[index:len(word2)]
        return result