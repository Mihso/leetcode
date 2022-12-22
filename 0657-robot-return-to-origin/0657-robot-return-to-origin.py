class Solution(object):
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        
        if moves.count("R") != moves.count("L"):
            return False
        if moves.count("U") != moves.count("D"):
            return False
        return True