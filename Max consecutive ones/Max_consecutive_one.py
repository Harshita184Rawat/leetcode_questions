class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        counts=[]
        count=0
        j=0
        for i in range(len(nums)):
            if nums[i]==1:
                count=count+1
            if nums[i]==0 or i==(len(nums)-1):
                counts.append(count)
                count=0
        print(counts)
        return max(counts)
            
