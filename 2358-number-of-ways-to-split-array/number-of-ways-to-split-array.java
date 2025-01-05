class Solution {
    public int waysToSplitArray(int[] nums) {
        long b=0,a=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            a+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            b+=nums[i];
            if(b>=(a-b)){
                ans++;
            }
        }
        return ans;
    }
}