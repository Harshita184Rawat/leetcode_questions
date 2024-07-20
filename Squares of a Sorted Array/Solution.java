class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sqArray = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            sqArray[i] = nums[i] * nums[i];
        }

        Arrays.sort(sqArray);
        
        return sqArray;
    }
}
