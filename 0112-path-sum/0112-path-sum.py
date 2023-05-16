# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def hasPathSum(self, root, targetSum):
        """
        :type root: TreeNode
        :type targetSum: int
        :rtype: bool
        """
        self.result = False
        def search(node, summer):
            current = summer + node.val
            if not node.left and not node.right:
                if targetSum == current:
                    self.result = True
                    print("found")
            else:
                if node.left:
                    search(node.left, current)
                if node.right:
                    search(node.right, current)
        if root:
            search(root,0)
            return self.result
        else:
            return False