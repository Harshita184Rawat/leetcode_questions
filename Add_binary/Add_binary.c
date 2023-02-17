class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a_sum=0
        b_sum=0
        n=len(a)
        k=len(b)

        if a=="0"and b=="0":
            return "0"
        else:
            for i in a:
                a_sum=int(i)*(pow(2,n-1))+a_sum 
                n=n-1

            for i in b:
                b_sum=int(i)*(pow(2,k-1))+b_sum 
                k=k-1

            sum=a_sum+b_sum
            binary=""
            sum
            while sum!=0:
                binary=str(sum%2)+binary
                sum=sum//2
            return binary
