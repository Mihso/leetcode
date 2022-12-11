# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def __init__(self):
        self.result = 0
    def sumNumbers(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def counter(noder, stringer):
            copy = stringer + str(noder.val)
            if noder.left:
                counter(noder.left,copy)
            if noder.right:
                counter(noder.right,copy)
            if noder.left == None and noder.right== None:
                self.result += int(copy)
        counter(root,"")
        return self.result