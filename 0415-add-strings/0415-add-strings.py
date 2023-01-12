class Solution(object):
    def addStrings(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        result = ""
        ind1 = len(num1) - 1
        ind2 = len(num2) - 1
        carry = "0"
        while ind1 >= 0 or ind2 >= 0:
            
            first = 0
            second = 0
            
            if ind1 >= 0:
                first = int(num1[ind1]) 
            if ind2 >= 0:
                second = int(num2[ind2])
            summ = first + second + int(carry)
            if summ > 9:
                summ = str(summ)
                carry = summ[0]
                result = summ[1] + result
            else:
                result = str(summ)+ result
                carry = "0"
            if ind1 >= 0:
                ind1 -= 1
            if ind2 >= 0:
                ind2 -= 1
        if int(carry) > 0:
            result = carry + result
        return result