"""
# Definition for a Node.
class Node(object):
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution(object):
    def __init__(self):
        self.longest = 0
    def maxDepth(self, root):
        """
        :type root: Node
        :rtype: int
        """
        def search(noder, count):
            copy = count + 1
            if noder:
                if noder.children:
                    for c in noder.children:
                        search(c, copy)
                else:
                    self.longest = max(self.longest, copy)
        search(root,0)
        return self.longest