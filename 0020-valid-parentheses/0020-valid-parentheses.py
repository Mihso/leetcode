class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        quer = []
        current = ""
        for unit in s:
            if unit == "{" or unit == "(" or unit == "[":
                quer.append(unit)
                current = unit
            else:
                if current and quer:
                    if quer[-1] == "{" and unit != "}":
                        return False
                    elif quer[-1] == "[" and unit != "]":
                        return False
                    elif quer[-1] == "(" and unit != ")":
                        return False
                    del quer[-1]
                    if len(quer) > 0:
                        current = quer[-1]
                else:
                    return False
        if quer:
            return False
        return True