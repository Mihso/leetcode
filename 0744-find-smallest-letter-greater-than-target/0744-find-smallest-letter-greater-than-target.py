class Solution(object):
    def nextGreatestLetter(self, letters, target):
        """
        :type letters: List[str]
        :type target: str
        :rtype: str
        """
        target = ord(target)
        
        for l in letters:
            if ord(l)> target:
                return l
        return letters[0]