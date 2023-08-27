class Solution {
    public int maxSumDivThree(int[] nums) {
      int sum=0, subValue=0;
      for(int i=0;i<nums.length;i++){
          sum=sum+nums[i];
      }  
      if(sum%3==0)
      {
          return sum;
      }
      else
      {
          
      }
    }
}
