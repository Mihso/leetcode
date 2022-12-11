class Solution(object):
    def minimumAbsDifference(self, arr):
        """
        :type arr: List[int]
        :rtype: List[List[int]]
        """
        arr.sort()
        print arr
        result = []
        minimum = float('inf')
        for n in range(len(arr)-1):
            minimum = min(minimum,abs(arr[n + 1] - arr[n]))
        print minimum
        
        for n in range(len(arr)-1):
            if abs(arr[n+1] - arr[n]) == minimum:
                result.append([arr[n], arr[n+1]])
        return result