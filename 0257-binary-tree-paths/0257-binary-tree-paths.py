# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def binaryTreePaths(self, root):
        """
        :type root: TreeNode
        :rtype: List[str]
        """
        final = []
        def looper(noder, stringer):
            result = stringer + "->" + str(noder.val) 
            if noder.left:
                looper(noder.left, result)
            if noder.right:
                looper(noder.right, result)
            if noder.left == None and noder.right == None:
                final.append(result)
        resulter = str(root.val)
        
        if root.left:
            looper(root.left, resulter)
        if root.right:
            looper(root.right, resulter)
        if root.left == None and root.right == None:
            final.append(resulter)
        
        return final
                
                