# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        diction = {}
        def finder(noder, level):
            if noder:
                if level not in diction:
                    diction[level] = []
                if noder.left:
                    finder(noder.left, level+ 1)
                if noder.right:
                    finder(noder.right, level + 1)
                diction[level].append(noder.val)
        finder(root, 1)
        result = []
        
        for n in range(len(diction),0,-1):
            result.append(diction[n])
        
        print diction
        return result