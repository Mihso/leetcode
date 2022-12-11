class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        compare = s.split(" ")
        res = {}
        used = {}
        if len(compare) != len(pattern):
            return False
        for n in range(len(compare)):
            if pattern[n] not in res:
                if compare[n] not in used:
                    res[pattern[n]] = compare[n]
                    used[compare[n]] = 1
                else:
                    return False
            if res[pattern[n]] != compare[n]:
                return False
        return True
        