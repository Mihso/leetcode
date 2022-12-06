# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        noder = new_node = ListNode()
        list1_cur = list1
        list2_cur = list2
        while list1_cur != None and list2_cur != None:
            if list1_cur.val < list2_cur.val:
                new_node.next = list1_cur
                list1_cur, new_node = list1_cur.next, list1_cur
            else:
                new_node.next = list2_cur
                list2_cur, new_node = list2_cur.next, list2_cur
        if list1_cur or list2_cur:
            new_node.next = list1_cur if list1_cur else list2_cur
        print(noder)
        print(new_node)
        return noder.next
        
        