# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def preorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """

        result = []

        def combo(noder, output):
            output.append(noder.val)
            if noder.left:
                combo(noder.left, output)
            if noder.right:
                combo(noder.right, output)
            
        if root:
            combo(root, result)
        return result