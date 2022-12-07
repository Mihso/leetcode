class Solution(object):
    def maxRepeating(self, sequence, word):
        """
        :type sequence: str
        :type word: str
        :rtype: int
        """
        
        result = word
        final = 0
        while len(result) <= len(sequence):
            if result in sequence:
                final = result.count(word)
            result += word
            
        return final