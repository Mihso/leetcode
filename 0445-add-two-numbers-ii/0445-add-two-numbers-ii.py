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
        s1 = ""
        s2= ""
        noder = l1
        while noder:
            s1 += str(noder.val)
            noder = noder.next
        noder = l2
        while noder:
            s2 += str(noder.val)
            noder=noder.next
        print((s1,s2))
        newValue = int(s1) + int(s2)
        final = list(str(newValue))
        
        result = ListNode(0)
        noder = result
        for f in final:
            noder.next = ListNode(int(f))
            noder= noder.next
        
        return result.next