class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        
        test = s.split(" ")
        result = ""
        for t in test:
            if t:
                result = t + " " + result
        return result[0:len(result)-1]