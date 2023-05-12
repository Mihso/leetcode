class Solution(object):
    def mostPoints(self, questions):
        """
        :type questions: List[List[int]]
        :rtype: int
        """
        tracker = len(questions) * [0]
        
        def calculate(index):
            if index > len(questions) -1:
                return 0
            question = questions[index]
            if tracker[index] != 0:
                return tracker[index]
            
            tracker[index] = max(calculate(index +1), question[0] + calculate(question[1]+index+1))
            return tracker[index]
        return calculate(0)