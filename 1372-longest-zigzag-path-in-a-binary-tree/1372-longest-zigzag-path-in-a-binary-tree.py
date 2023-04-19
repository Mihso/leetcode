# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def longestZigZag(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        
        self.result = 0
        
        def pather(noder,lefter, unit):
            if noder:
                self.result = max(self.result, unit)
                if lefter:
                    pather(noder.left,False, unit + 1)
                    pather(noder.right, True, 1)
                else:
                    pather(noder.left,False,1)
                    pather(noder.right,True, unit + 1)
        pather(root,True,0)
        pather(root,False,0)
        
        return self.result