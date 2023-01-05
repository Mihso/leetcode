class Solution(object):
    def haveConflict(self, event1, event2):
        """
        :type event1: List[str]
        :type event2: List[str]
        :rtype: bool
        """
        if event1[0] > event2[0]:
            if event2[1] >= event1[0]:
                return True
        else:
            if event1[1] >= event2[0]:
                return True
        return False
        