class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int n=nums[i]|nums[j];
                if(n%2==0){
                    return true;
                }
            }
        }
        return false;
    }
}