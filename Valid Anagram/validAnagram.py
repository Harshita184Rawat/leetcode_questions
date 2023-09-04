class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        flag=1
        if len(s)!=len(t):
            return False
        else:
            for i in range(len(s)):
                if s.count(s[i])!=t.count(s[i]):
                    flag=0
                    break
                else:
                    continue
                    
            if flag==0:
                return False
            else:
                return True
