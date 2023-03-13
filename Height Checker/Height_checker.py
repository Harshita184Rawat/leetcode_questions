class Solution(object):
    def heightChecker(self, heights):
        """
        :type heights: List[int]
        :rtype: int
        """
        expected=heights[:]
        for i in range(len(expected)):
            for j in range(len(expected)):
                if expected[i]<expected[j]:
                    temp=expected[i]
                    expected[i]=expected[j]
                    expected[j]=temp
        print(heights)
        print(expected)
        
        count=0
        for i in range(len(heights)):
            if heights[i]!=expected[i]:
                count=count+1
                print(count)
        return count
