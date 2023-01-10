# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSubtree(self, root, subRoot):
        """
        :type root: TreeNode
        :type subRoot: TreeNode
        :rtype: bool
        """
        stringRoot = ""
        stringSub = ""
        def convert(noder):
            result = "-" + str(noder.val) + "-"
            if noder.left:
                result += convert(noder.left)
            else:
                result += "empty"
            if noder.right:
                result += convert(noder.right)
            else:
                result += "empty"
            return result
        stringRoot = convert(root)
        stringSub = convert(subRoot)
        
        if stringSub in stringRoot:
            return True
        return False