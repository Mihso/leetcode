class Solution(object):
    def canBeTypedWords(self, text, brokenLetters):
        """
        :type text: str
        :type brokenLetters: str
        :rtype: int
        """
        
        words = text.split(" ")
        count = len(words)
        for w in words:
            typer = True
            for b in brokenLetters:
                if b in w:
                    typer = False
            if typer == False:
                count -= 1
        return count