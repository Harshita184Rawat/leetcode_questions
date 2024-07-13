class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if haystack.__contains__(needle):
            i = haystack.index(needle)
            return i
        else:
            return -1

        
