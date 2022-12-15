class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        
        if len(flowerbed) == 1 and flowerbed[0] == 0:
            return 1
        
        while n > 0:
            placed = False
            for unit in range(0, len(flowerbed)):
                if flowerbed[unit] == 0:
                    if unit == 0:
                        if flowerbed[unit + 1] == 0:
                            flowerbed[unit] = 1
                            n -= 1
                            placed = True
                    elif unit == len(flowerbed) -1:
                        if flowerbed[unit -1] == 0:
                            flowerbed[unit] = 1
                            n -= 1
                            placed = True
                    elif flowerbed[unit-1] == 0 and flowerbed[unit+1] == 0:
                        flowerbed[unit] = 1
                        n -= 1
                        placed = True
            if placed == False:
                return False
            print(flowerbed)
        return True
                
        