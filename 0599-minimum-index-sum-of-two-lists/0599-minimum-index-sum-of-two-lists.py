class Solution(object):
    def findRestaurant(self, list1, list2):
        """
        :type list1: List[str]
        :type list2: List[str]
        :rtype: List[str]
        """
        
        minimum = float('inf')
        
        values = {}
        
        result = []
        for word in list1:
            if word in list2:
                values[word] = list1.index(word) + list2.index(word)
                minimum = min(minimum, values[word])
        for unit in values:
            if values[unit] == minimum:
                result.append(unit)
        return result