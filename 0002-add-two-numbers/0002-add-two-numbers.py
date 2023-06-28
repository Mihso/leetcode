# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        s1= "" 
        s2 = ""
        
        noder = l1
        while noder:
            s1 = str(noder.val) + s1
            noder = noder.next
        noder = l2
        while noder:
            s2 = str(noder.val) + s2
            noder = noder.next
        new = int(s1) + int(s2)
        final = list(str(new))
        final.reverse()
        result = ListNode(0)
        noder = result
        for l in final:
            noder.next = ListNode(l)
            noder = noder.next
            
        
        return result.next