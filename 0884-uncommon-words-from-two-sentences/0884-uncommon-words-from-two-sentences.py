class Solution(object):
    def uncommonFromSentences(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: List[str]
        """
        list1 = s1.split(" ")
        list2 = s2.split(" ")
        set1 = {}
        set2 = {}
        result = []
        for l in list1:
            if l not in set1:
                set1[l] = 1
            else:
                set1[l] += 1
        for l in list2:
            if l not in set2:
                set2[l] = 1
            else:
                set2[l] += 1
        for s in set1:
            if s not in set2 and set1[s] == 1:
                result.append(s)
        for s in set2:
            if s not in set1 and set2[s] == 1:
                result.append(s)
        return result
        