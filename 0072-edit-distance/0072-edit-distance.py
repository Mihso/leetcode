class Solution(object):
    def minDistance(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: int
        """
        
        if word1 == word2:
            return 0
        
        w1 = list(word1)
        w2 = list(word2)
        
        if len(w1) == 0 or len(w2) == 0:
            return max(len(w1), len(w2))
        visited = set()
        quer = deque()
        quer.append((0,0))
        num = 0
        while quer:
            for q in range(len(quer)):
                i, j = quer.popleft()
                if (i,j) in visited:
                    continue
                visited.add((i,j))
                while i < len(w1) and j < len(w2) and w1[i] == w2[j]:
                    i += 1
                    j += 1
                if i == len(w1) and j == len(w2):
                    return num
                quer.append((i, j+1))
                quer.append((i+1,j+1))
                quer.append((i+1,j))
            num += 1