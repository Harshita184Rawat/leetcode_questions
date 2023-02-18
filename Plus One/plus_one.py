class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n=len(digits)
        number=""
        k=0
        output=[]
        for digit in digits:
            number=number+str(digit)

        result=int(number)+1
        output_str=str(result)

        for num in output_str:
            output.append(int(num))
            
        return output
        
