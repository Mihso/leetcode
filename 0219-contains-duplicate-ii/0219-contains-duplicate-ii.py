class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        
        vals = {}
        for n in nums:
            if n not in vals: 
                vals[n] = 1
            else:
                vals[n] += 1
        
        for s in vals:
            if vals[s] > 1:
                indexer = nums.index(s)
                print indexer
                for n in range(indexer+1, len(nums)):
                    if nums[n] == nums[indexer] and n-indexer <= k:
                        return True
                    elif nums[n] == nums[indexer]:
                        indexer = n
        return False