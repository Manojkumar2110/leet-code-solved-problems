class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        int sum1=(n*(n+1))/2;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int ans=Math.abs(sum-sum1);
        return ans;
    }
}