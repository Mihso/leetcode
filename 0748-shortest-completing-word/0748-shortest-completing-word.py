class Solution(object):
    def shortestCompletingWord(self, licensePlate, words):
        """
        :type licensePlate: str
        :type words: List[str]
        :rtype: str
        """
        result = "1" * 1000
        check = {}
        for p in licensePlate:
            l = p.lower()
            if l not in check and l.isalpha():
                check[l] = 1
            elif l.isalpha():
                check[l] += 1
        for word in words:
            dup = dict(check)
            confirm = True
            low = word.lower()
            for s in low:
                if s in check:
                    dup[s] -= 1
            for d in dup:
                if dup[d] >= 1:
                    confirm  = False
            if confirm == True:
                if len(result) > len(low):
                    result = word
        return result