class Solution(object):
    def checkDistances(self, s, distance):
        """
        :type s: str
        :type distance: List[int]
        :rtype: bool
        """
        diction = {}
        for unit in range(26):
            letter = chr(unit + 97)
            if letter not in diction:
                diction[letter] = distance[unit]
        for d in diction:
            if d in s:
                first = s.index(d)
                last = s.rindex(d)
                if (last-first - 1) != diction[d]:
                    return False
        return True