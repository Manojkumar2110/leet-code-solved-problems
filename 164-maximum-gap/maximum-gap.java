class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        int ans=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            ans=nums[i]-nums[i-1];
            if(max<ans){
                max=ans;
            }
        }
        return max;
    }
}