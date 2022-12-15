class Solution(object):
    def checkRecord(self, s):
        """
        :type s: str
        :rtype: bool
        """
        late = 0
        absence = 0
        for unit in s:
            if unit == "A":
                absence += 1
                late = 0
            elif unit == "L":
                late +=1
            else:
                late = 0
            if late >= 3:
                return False
            if absence >= 2:
                return False
        return True