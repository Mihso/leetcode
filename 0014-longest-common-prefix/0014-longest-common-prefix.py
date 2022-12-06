class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        prefix = ""
        result = ""
        checker = True
        if len(strs) == 1:
            return strs[0]
        for f in range(len(strs[0])):
            initial = strs[0]
            prefix = initial[slice(f+1)]
            print(prefix)
            print(prefix[slice(f)])
            for x in range(1, len(strs)):
                initial2 = strs[x]
                prefix2 = initial2[slice(f+1)]
                if prefix2 != prefix:
                    checker = False
            if checker == True:
                result = prefix
        return result