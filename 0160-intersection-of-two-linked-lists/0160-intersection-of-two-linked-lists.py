# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        
        intersectVal = 0
        checker = set()
        
        cur_node = headA
        
        while cur_node:
            checker.add(cur_node)
            cur_node= cur_node.next
        compare = headB
        while compare:
            if compare in checker:
                return compare
            compare = compare.next
        return None;
        
        
        