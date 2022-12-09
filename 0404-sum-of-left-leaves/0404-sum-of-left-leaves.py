# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sumOfLeftLeaves(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        
        summer = 0
        
        def searcher(noder, status):
            result = 0
            if noder.left:
                result += searcher(noder.left, "left")
            if noder.right:
                result += searcher(noder.right, "right")
            if noder.left == None and noder.right == None and status == "left":
                result += noder.val
            return result
        return(searcher(root,"right"))
                
        