class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxSum=0,minSum=0;
        for(int i=0;i<nums.length;i++){
            maxSum=Math.max(0,maxSum)+nums[i];
            minSum=Math.min(0,minSum)+nums[i];
            max=Math.max(max,maxSum);
            min=Math.min(min,minSum);
        }
        return Math.max(Math.abs(min),max);
    }
}