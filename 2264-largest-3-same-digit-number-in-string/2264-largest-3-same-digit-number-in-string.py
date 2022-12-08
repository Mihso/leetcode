class Solution(object):
    def largestGoodInteger(self, num):
        """
        :type num: str
        :rtype: str
        """
        solutions = []
        for unit in range(len(num)-2):
            check = num[unit: unit+3]
            if check.count(check[0]) == 3:
                solutions.append(check)
        if len(solutions) > 0:
            return max(solutions)
        else:
            return ""
            
        
        