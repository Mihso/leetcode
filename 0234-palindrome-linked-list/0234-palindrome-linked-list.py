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
        count = []
        while noder:
            count.append(noder.val)
            noder = noder.next
            
        check = list(count)
        check.reverse()
        return (count == check)