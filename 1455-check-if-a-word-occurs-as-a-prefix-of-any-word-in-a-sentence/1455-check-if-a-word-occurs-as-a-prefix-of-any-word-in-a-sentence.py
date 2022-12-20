class Solution(object):
    def isPrefixOfWord(self, sentence, searchWord):
        """
        :type sentence: str
        :type searchWord: str
        :rtype: int
        """
        lister = sentence.split(" ")
        print(lister)
        
        for word in range(len(lister)):
            check = True
            if len(searchWord) <= len(lister[word]):
                for i in range(len(searchWord)):
                    if lister[word][i] != searchWord[i]:
                        check = False
            else:
                check = False
            if check == True:
                return word + 1
        return -1