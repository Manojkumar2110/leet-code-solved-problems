class Solution {
    public boolean canAliceWin(int[] nums) {
        int small=0;
        int large=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                small+=nums[i];
            }
            else{
                large+=nums[i];
            }
        }
        if(small==large){
            return false;
        }
        return true;
    }
}