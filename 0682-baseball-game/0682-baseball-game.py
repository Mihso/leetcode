class Solution(object):
    def calPoints(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        record = []
        
        for o in operations:
            if o == "+":
                if len(record) >= 2:
                    record.append(record[-1] + record[-2])
                elif len(record) == 1:
                    record.append(record[-1])
            elif o =="D":
                if len(record) >= 1:
                    record.append(record[-1]*2)
            elif o == "C":
                if len(record) >= 1:
                    del record[-1]
            else:
                record.append(int(o))
            print(record)
        if len(record) > 0:
            return sum(record)
        return 0