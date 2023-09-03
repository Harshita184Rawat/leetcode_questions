class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        """
        :type jewels: str
        :type stones: str
        :rtype: int
        """
        count=0
        result=0
        for i in jewels:
            count=0
            for j in range(0,len(stones)):
                if i==stones[j]:
                    count = count + 1
                    print(count)
            result = result + count

        return result
        
        
