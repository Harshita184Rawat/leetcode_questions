class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        i=0
        x=0
        for i in range(0,n+1):
            if i not in nums:
                x=i
                break;
        return x
