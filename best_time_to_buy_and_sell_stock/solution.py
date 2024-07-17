class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buying_price = prices[0]
        maxp = 0

        for p in prices[1:]:
            if buying_price > p:
                buying_price = p
            
            maxp = max(maxp, p - buying_price)
        
        return maxp

        
