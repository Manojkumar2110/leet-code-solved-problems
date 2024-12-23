class Solution {
    public int findMiddleIndex(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int l=0,r=0;
            for(int j=0;j<i;j++){
                l+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                r+=nums[k];
            }
            if(l==r){
                ans=i;
                break;
            }
        }
        return ans;
    }
}