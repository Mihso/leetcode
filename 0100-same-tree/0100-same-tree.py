# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        
        def looper(noderp, noderq):
            lefter = True
            righter = True
            if noderp.val != noderq.val:
                return False
            else:
                if noderp.left!= None and noderq.left != None:
                    lefter = looper(noderp.left, noderq.left)
                elif noderp.left == None and noderq.left == None:
                    pass
                else:
                    return False
                if noderp.right!= None and noderq.right != None:
                    righter = looper(noderp.right, noderq.right)
                elif noderp.right == None and noderq.right == None:
                    pass
                else:
                    return False
        
            if lefter and righter:
                return True
            else:
                return False
        
        if p != None and q != None:
            return looper(p,q)
        elif p == None and q == None:
            return True
        else:
            return False