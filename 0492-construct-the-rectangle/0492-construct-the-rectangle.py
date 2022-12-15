class Solution(object):
    def constructRectangle(self, area):
        """
        :type area: int
        :rtype: List[int]
        """
        
        length = area
        width = 1
        result = [length, width]
        while length >= width:
            if length * width == area:
                result = [length, width]
            width += 1
            length = area / width
            
        return result