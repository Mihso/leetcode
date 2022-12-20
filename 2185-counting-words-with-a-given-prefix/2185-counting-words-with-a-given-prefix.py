class Solution(object):
    def prefixCount(self, words, pref):
        """
        :type words: List[str]
        :type pref: str
        :rtype: int
        """
        count = 0
        for word in words:
            check = True
            if len(pref) <= len(word):
                for i in range(len(pref)):
                    if word[i] != pref[i]:
                        check = False
            else:
                check = False
            if check == True:
                count += 1
        return count