class Solution(object):
    def asteroidCollision(self, asteroids):
        """
        :type asteroids: List[int]
        :rtype: List[int]
        """
        remaining = []
        for a in asteroids:
            if not remaining:
                remaining.append(a)
            elif remaining[-1] < 0:
                remaining.append(a)
            else:
                if a < 0:
                    if abs(remaining[-1]) > abs(a):
                        pass
                    else:
                        while len(remaining) > 0 and abs(remaining[-1]) < abs(a) and remaining[-1] > 0:
                            remaining.pop(-1)
                        if len(remaining) <= 0:
                            remaining.append(a)
                        elif remaining[-1] == abs(a):
                            remaining.pop(-1)
                        elif remaining[-1] < 0:
                            remaining.append(a)
                else:
                    remaining.append(a)
        return remaining