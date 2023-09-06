class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        output=[]
        n=len(nums)
        newNums=sort(nums)
        for i in range(1, n+1/2):
            if i in nums:
                continue
            else:
                output.append(i)
        return output
        
