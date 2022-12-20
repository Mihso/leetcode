class Solution(object):
    def countPrefixes(self, words, s):
        """
        :type words: List[str]
        :type s: str
        :rtype: int
        """
        count = 0
        for word in words:
            match = True
            if len(word) <= len(s):
                for i in range(len(word)):
                    if word[i] != s[i]:
                        match = False
            else:
                match = False
            if match == True:
                count +=1
        return count
            