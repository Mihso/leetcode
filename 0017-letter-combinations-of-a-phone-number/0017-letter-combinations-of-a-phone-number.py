class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        result = []
        
        data = dict()
        data['2'] = ["a","b","c"]
        data['3'] = ["d","e","f"]
        data['4'] = ['g','h','i']
        data['5'] = ['j','k','l']
        data['6'] = ['m','n','o']
        data['7'] = ['p','q','r','s']
        data['8'] = ['t','u','v']
        data['9'] = ['w','x','y','z']
        if not digits:
            return ""
        def adder(stringer, index):
            for d in data[digits[index]]:
                copy = str(stringer) + d
                copyindex = index + 1
                
                if copyindex > len(digits) - 1:
                    result.append(copy)
                else:
                    adder(copy, copyindex)
        adder("",0)
        return result
                