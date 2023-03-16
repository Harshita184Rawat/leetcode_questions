class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        n=len(s)
        k=n-1
        for i in range(n//2):
            temp=s[i]
            s[i]=s[k]
            s[k]=temp
            k=k-1
