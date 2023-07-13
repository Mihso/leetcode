class Solution(object):
    def canFinish(self, numCourses, prerequisites):
        """
        :type numCourses: int
        :type prerequisites: List[List[int]]
        :rtype: bool
        """
        
        taken = []
        
        for n in range(numCourses):
            taken.append([])
        for p in prerequisites:
            taken[p[0]].append(p[1])
        print(taken)
        loop = True
        while loop == True:
            loop = False
            for t in taken:
                if len(t) > 0:
                    for p in t:
                        if len(taken[p]) <= 0:
                            t.remove(p)
                            loop = True
        print(taken)
        for t in taken:
            if len(t) > 0:
                return False
        return True