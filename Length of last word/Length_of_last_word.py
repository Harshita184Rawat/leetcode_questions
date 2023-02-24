class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        x=s.split() # to split and create a list of words present in s
        n=len(x)
        return len(x[n-1])
