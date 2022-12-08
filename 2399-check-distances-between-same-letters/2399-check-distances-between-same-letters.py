class Solution(object):
    def checkDistances(self, s, distance):
        """
        :type s: str
        :type distance: List[int]
        :rtype: bool
        """
        diction = {}
        found = {}
        for unit in range(26):
            letter = chr(unit + 97)
            if letter not in diction:
                diction[letter] = distance[unit]
        for d in diction:
            if d in s:
                first = s.index(d)
                if d not in found:
                    last = first + 1 + diction[d]
                    if last >= len(s):
                        return False
                    elif s[last] != d:
                        return False
                    found[d] = 1
        return True