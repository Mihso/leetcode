# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def findFrequentTreeSum(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        values = {}
        final = []
        maxLen = 0
        def search(noder):
            result = noder.val
            if noder.left:
                result += search(noder.left)
            if noder.right:
                result += search(noder.right)
            if result not in values:
                values[result] = 1
            else:
                values[result] += 1
            return result
        search(root)
        for v in values:
            if values[v] > maxLen:
                maxLen = values[v]
        for v in values:
            if values[v] == maxLen:
                final.append(v)
        return final