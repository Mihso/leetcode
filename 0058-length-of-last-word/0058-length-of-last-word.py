class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        words = s.split(" ")
        
        index = len(words)-1
        while index >= 0:
            if len(words[index]) > 0:
                return len(words[index])
            else:
                index -= 1
        return 0