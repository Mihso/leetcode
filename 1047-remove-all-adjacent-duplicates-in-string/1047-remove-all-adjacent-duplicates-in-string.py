class Solution(object):
    def removeDuplicates(self, s):
        """
        :type s: str
        :rtype: str
        """
        
        copy = []
        index = 0
        for unit in s:
            copy.append(unit)
        while index < len(copy)-1 and len(copy) > 0:
            current = copy[0]
            if copy[index] == copy[index + 1]:
                del copy[index: index + 2]
                index = max(0,index -1)
            else:
                index += 1
        return "".join(copy)