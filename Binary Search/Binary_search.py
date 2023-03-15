class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        '''low = 0
        high = len(nums)
        mid = (low+high)/2
        while low<=high:
            if target==nums[mid]:
                return mid
            elif target<nums[mid]:
                high = mid - 1
            else:
                low = mid + 1
        else:
            return -1'''
        if target in nums:
            return nums.index(target)
        else:
            return -1
