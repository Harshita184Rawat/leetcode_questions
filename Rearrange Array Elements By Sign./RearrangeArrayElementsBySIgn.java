class Solution {
    public int[] rearrangeArray(int[] nums) {
        
          int numsSize = nums.length;
          int n = numsSize/2;
          int j=0;
          int k=0;
          // create Two seperate arrays for +ve and -ve integers
          int numsOfPositives[] = new int[n];
          int numsOfNegatives[] = new int[n];

          // Resultant array
          int output[] = new int[numsSize];

          // Seperating integrs into two arrays of -ve and +ve integers
          for(int i=0;i<numsSize;i++)
          {
              if(nums[i]>0)
              {
                  numsOfPositives[j]=nums[i];
                  j++;
              }
              else
             {
                numsOfNegatives[k]=nums[i];
                k++;
             }
          }

        // adding opposite sign integers alternatively to resultant array
        int positiveIndex=0;
        int negativeIndex=0;
          for(int i=0;i<numsSize;i++)
          {
              output[i]=numsOfPositives[positiveIndex];
              i++;
              output[i]=numsOfNegatives[negativeIndex];
              positiveIndex++;
              negativeIndex++;
          }
          
          return output;    
    }
}
