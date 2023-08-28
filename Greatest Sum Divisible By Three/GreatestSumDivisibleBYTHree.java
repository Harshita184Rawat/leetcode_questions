class Solution {
    public int maxSumDivThree(int[] nums) {
        int n=nums.length;
        int[] sums=new int [3];

        for(int i=0; i<n; i++){
            int s0=sums[0]+nums[i];
            int s1=sums[1]+nums[i];
            int s2=sums[2]+nums[i];

            int rim0=s0 % 3;
            int rim1=s1 % 3;
            int rim2=s2 % 3;

            sums[rim0]=Math.max(sums[rim0], s0);
            sums[rim1]=Math.max(sums[rim1], s1);
            sums[rim2]=Math.max(sums[rim2], s2);
        } 

        return sums[0];
    }
}
