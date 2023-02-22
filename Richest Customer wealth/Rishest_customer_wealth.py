class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        x=[]
        i=0
        m = len(accounts)
        n = len(accounts[i])
        for i in range(m):
            sum=0
            for j in range(n):
                sum=sum+accounts[i][j]
            x.append(sum)
        print(x)

        return max(x)
