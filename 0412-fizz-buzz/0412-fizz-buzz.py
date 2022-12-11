class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        for unit in range(1,n+1):
            adder = ""
            if unit % 3 == 0:
                adder += "Fizz"
            if unit % 5 == 0 :
                adder += "Buzz"
            if unit % 3 != 0 and unit % 5 != 0:
                adder = str(unit)
            result.append(adder)
        return result