class MyStack(object):

    def __init__(self):
        self.stacker = []

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        self.stacker.insert(0,x)
        

    def pop(self):
        """
        :rtype: int
        """
        value = self.stacker[0]
        del self.stacker[0]
        return value
        

    def top(self):
        """
        :rtype: int
        """
        return self.stacker[0]
        

    def empty(self):
        """
        :rtype: bool
        """
        return(len(self.stacker) == 0)
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()