class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        if word.lower() == word:
            return True
        elif word.upper() == word:
            return True
        check = word[0].upper() + word[1:len(word)].lower()
        if check == word:
            return True
        return False
        