# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        noder = head
        copy = None
        while noder:
            copy = ListNode(noder.val,copy)
            noder = noder.next
        noder = head
        
        while noder:
            if copy.val != noder.val:
                return False
            else:
                noder = noder.next
                copy = copy.next
        return True