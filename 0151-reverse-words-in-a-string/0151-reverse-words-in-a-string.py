class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        
        test = s.split(" ")
        print test
        result = ""
        for t in test:
            if t:
                result = t + " " + result
        print result[0:len(result)-1]
        return result[0:len(result)-1]